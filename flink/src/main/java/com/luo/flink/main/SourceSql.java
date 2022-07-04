package com.luo.flink.main;

import com.luo.flink.entity.SqlTask;
import com.luo.flink.service.*;


public class SourceSql {

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new SqlTask(new InfoTaskService()));
        Thread t2 = new Thread(new SqlTask(new PTaskService()));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}






