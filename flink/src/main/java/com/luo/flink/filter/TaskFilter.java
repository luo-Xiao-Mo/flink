package com.luo.flink.filter;

import com.luo.flink.entity.business.CJCJTBJD;
import com.luo.flink.entity.business.TFillTask;
import com.luo.flink.service.FillService;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class TaskFilter {

    private final static List<String> bhList = Arrays.asList("B210",
            "E203",
            "E204-2",
            "SHE203",
            "C203",
            "C204-1",
            "C204-2",
            "C210",
            "D202",
            "SHF206",
            "X210",
            "S204-3",
            "S203",
            "S210",
            "ShS203",
            "205-3",
            "205-3-1",
            "205-5",
            "205-5-2",
            "NY218",
            "202-1");

    private final static List<String> monthList = Arrays.asList("B204-1",
            "S204-1",
            "B203",
            "E204-1",
            "SHC204-1",
            "SHC204-2",
            "F203",
            "F210",
            "D201",
            "IV510",
            "IV511",
            "YS401",
            "X204-1",
            "X204-2",
            "206",
            "H202",
            "201-1",
            "205-1",
            "205-2",
            "205-6",
            "205-7");

    /**
     * 总的判断方法
     *
     * @param cjcjtbjd cdc中读出的业务对象信息
     * @param f1       验证函数对象
     */
    public static TFillTask decide(CJCJTBJD cjcjtbjd,
                                   List<Function<CJCJTBJD, Boolean>> f1) {
        boolean item = false;
        if (f1 != null && !f1.isEmpty()) {
            for (Function<CJCJTBJD, Boolean> f : f1) {
                if (f.apply(cjcjtbjd)) {
                    item = true;
                    break;
                }
            }
        }
        if (!item) return null;
        FillService fillService = new FillService();
        return cjcjtbjd.getTask().assignment(fillService.queryCode(),
                fillService.queryTask());
    }

    /**
     * 判断是否是半年报
     */
    public static boolean isYear(CJCJTBJD cjcjtbjd) {
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        int monthValue = now.minusMonths(1).getMonthValue();
        double d = Math.floor(monthValue / 7) + 1;
        if (month == 1 || month == 7) {
            String bh = cjcjtbjd.getBh();
            String bgq = cjcjtbjd.getBgq();
            String rwid = cjcjtbjd.getRwid();
            //报告期别
            String re_qb = bgq.substring(bgq.length() - 2);
            return bgq.substring(bgq.length() - 1).equals(String.valueOf(d))
                    && "HY".equals(re_qb) && bh.equals("GY204-2") && "000000000000_1013"
                    .equals(rwid);

        }
        return false;
    }

    /**
     * 判断是否是季报
     */
    public static boolean isQuarter(CJCJTBJD cjcjtbjd) {
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        int monthValue = now.minusMonths(1).getMonthValue();
        double d = Math.floor(monthValue + 2) / 3;
        if (month == 4 || month == 7 || month == 10) {
            String bh = cjcjtbjd.getBh();
            String bgq = cjcjtbjd.getBgq();
            String rwid = cjcjtbjd.getRwid();
            //报告期别
            String re_qb = bgq.substring(bgq.length() - 2);
            return bgq.substring(bgq.length() - 1).equals(String.valueOf(d))
                    && "SS".equals(re_qb) && bhList.contains(bh) && "000000000000_1013"
                    .equals(rwid);

        }
        return false;
    }

    /**
     * 判断是否是月报
     */
    public static boolean isMonth(CJCJTBJD cjcjtbjd) {
        List<String> list = Arrays.asList("X583", "X583");
        String rwid = cjcjtbjd.getRwid();
        String bh = cjcjtbjd.getBh();
        String bgq = cjcjtbjd.getBgq().substring(0, 6);
        String month = getMonth();
        if ("000000000000_1013".equals(rwid) && monthList.contains(bh)
                && month.equals(bgq))
            return true;
        else if ("000000000000_893".equals(rwid) && list.contains(bh)
                && month.equals(bgq))
            return true;
        else if ("000000000000_886".equals(rwid) && "S204-3".equals(bh)
                && month.equals(bgq))
            return true;
        return false;
    }

    /**
     * 获取上个月的年月
     */
    private static String getMonth() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        return simpleDateFormat.format(calendar.getTime());
    }
}
