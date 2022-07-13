package com.luo.flink.window;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.datastream.WindowedStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.streaming.api.functions.windowing.WindowFunction;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.GlobalWindow;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.util.Collector;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Random;

/**
 * @author doublexi
 * @date 2021/10/30 11:37
 * @description 基于时间的滚动时间窗口
 * 1、获取流数据源 * 2、获取窗口 * 3、操作窗口数据 * 4、输出窗口数据
 */
public class WindowDemo {
    public static void main(String[] args) throws Exception {
        // 获取数据源
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);
        // 使用匿名内部类的方式添加自定义数据源
        DataStreamSource<String> data = env.addSource(new SourceFunction<String>() {
            int count = 0; // 每1秒产生一个数字，拼接字符串作为数据源事件发送出去。

            @Override
            public void run(SourceContext<String> ctx) throws Exception {
                while (true) {
                    ctx.collect(count + "号数据源");
                    count++;
                    Thread.sleep(1000);
                }
            }

            @Override
            public void cancel() {
            }
        });

        SingleOutputStreamOperator<Tuple3<String, String, String>> maped = data.map(new MapFunction<String, Tuple3<String, String, String>>() {
            @Override
            public Tuple3<String, String, String> map(String s) throws Exception {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                long l = System.currentTimeMillis();
                String dataTime = sdf.format(l);
                Random random = new Random();
                int randomNum = random.nextInt(5);
                return new Tuple3<>(s, dataTime, String.valueOf(randomNum));
            }
        });
//                data.map
        // 对输入的流的数据进行转换封装
//        SingleOutputStreamOperator<Tuple3<String, String, String>> maped =
//                data.map((String value) -> {
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//                    long l = System.currentTimeMillis();
//                    String dataTime = sdf.format(l);
//                    Random random = new Random();
//                    int randomNum = random.nextInt(5);
//                    return new Tuple3<>(value, dataTime, String.valueOf(randomNum));
//                });
        // 为了增加并行度，进行keyBy聚合操作，相同key数据会进入同一个分区，给同一个subtask任务
        KeyedStream<Tuple3<String, String, String>, String> keyByed = maped.keyBy(value -> value.f2);
//        // 2、获取窗口 // 基于时间驱动， 每5s割出一个窗口
        WindowedStream<Tuple3<String, String, String>, String, TimeWindow> timeWindow =
                keyByed.timeWindow(Time.seconds(5));
        // 基于事件驱动, 每相隔3个事件(即三个相同key的数据), 划分一个窗口进行计算 //
//        WindowedStream<Tuple2<String, Integer>, Tuple, GlobalWindow> countWindow =
//                keyedStream.countWindow(3); //
        // 3、操作窗口数据 // apply是窗口的应用函数，即apply里的函数将应用在此窗口的数据上。
        // 第一个参数Tuple3是窗口输入进来的数据类型，第二个参数Object是输出的数据类型，
        // 第三个参数String是数据源中key的数据类型，第四个参数指明当前处理的窗口是什么类型的窗口
        SingleOutputStreamOperator<String> applyed = timeWindow.apply(new WindowFunction<Tuple3<String, String, String>,
                String, String, TimeWindow>() {
            // s就是上面一行一行的数据源，window代表当前窗口，
            // 一个窗口中数据源可能是相同的，根据keyBy分组的，如果有两个数据源相同，就会放入这个input迭代器里，
            // out将处理结果往外发送
            @Override
            public void apply(String s, TimeWindow window, Iterable<Tuple3<String, String, String>> input, Collector<String> out) throws Exception {
                Iterator<Tuple3<String, String, String>> iterator = input.iterator();
                // new 一个StringBuilder去做字符串拼接
                StringBuilder sb = new StringBuilder();
                while (iterator.hasNext()) {
                    // 这个next就是一个一个Tuple3数据
                    Tuple3<String, String, String> next = iterator.next();
                    sb.append(next.f0 + "..." + next.f1 + "..." + next.f2);
                } // 拼接输出的信息，
                String s1 = s + "..." + window.getStart() + "..." + sb;
                out.collect(s1);
            }
        });
        applyed.print();
        env.execute();
    }
}
