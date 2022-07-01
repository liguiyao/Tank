package com.lgy.demo15;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class testQueue {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.addQueue(20);
        arrayQueue.addQueue(40);
        arrayQueue.addQueue(60);
        arrayQueue.showQueue();
        int peek = arrayQueue.peek();
        System.out.println(peek);
        int queue = arrayQueue.getQueue();
        System.out.println(queue);
//        String s1 = nameFormat("Han Shun Ping");
//        System.out.println(s1);

//        String reverse = testQueue.reverse("abcdef", 1, 4);
//        System.out.println(reverse);
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = sdf.format(date);
//        System.out.println(format);
//
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now.getYear() + "-" + now.getMonthValue() + "-" + now.getDayOfMonth());

    }

    public static String reverse(String str, int start, int end) {
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start,j=end; i < j; i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    public static String nameFormat(String name) {
        String[] s = name.split(" ");
        String format = String.format("%s,%s .%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        return format;
    }
}
