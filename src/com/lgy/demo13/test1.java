package com.lgy.demo13;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws ParseException {

//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//        String format = sdf.format(date);
//        System.out.println(format);
//
//        String s1 = String.valueOf(sdf.parse(format).getTime() / 1000);
//        System.out.println(s1);

//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("123");
//        stringBuffer.append("456");
//        String s = stringBuffer.toString();
//        System.out.println(s);
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        BigDecimal bg = new BigDecimal(a+"");
        StringBuffer sb = new StringBuffer();
        sb.append(bg);
        int index = 0;
        if (sb.indexOf(".") != -1) {
            index = sb.indexOf(".");
            for (int i = index-3; i > 0; i-=3) {
                sb.insert(i, ",");
            }
        }
        System.out.println(sb);


    }
}
