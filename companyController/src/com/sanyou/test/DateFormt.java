package com.sanyou.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Name: DateFormt
 * User: Qixd
 * Date: 2020/4/10
 * Time: 23:07
 * Description:
 */
public class DateFormt {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
