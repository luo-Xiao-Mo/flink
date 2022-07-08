1.项目说明
本项目实现o-o-d(oracle-oracle-Dm)
2.代码目录说明
com.luo.flink
       - entity 数据库实体类和任务对象
       - filter 数据流过滤数据对象
       - main   主程序的启动文件
       - service 程序的服务文件
         - dao  jdbc操作服务
         - task 相关任务的服务
       - sink   自定义的oracleSink(DataStream方式启动)
       - template 相关的模版文件
       - type   枚举和常量
       - util   项目工具类
resource
       - template
         - table.ftl 创建表的模版文件
         - table.json 创建表的属性文件
       - archiveLog.json oracle日志的json文件
       - dmSink.properties 达梦源数据库配置文件
       - log4j.properties  项目的日志配置文件
       - oracleSink.properties oracle中间数据库信息
       - oracleSource.properties oracle源数据库信息
       - task.json  配置当前程序需要执行的任务