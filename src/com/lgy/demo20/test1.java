package com.lgy.demo20;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
        News n1 = new News("新闻一", "新冠确诊超千万，数百万印度教徒奔恒河圣浴引民众担忧");
        News n2 = new News("新闻二", "男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        List<News> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);

        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i).processContent(list.get(i).getContent()));
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("jack", 1200);
        map.put("tom", 800);
        map.put("smith", 2000);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            map.put(entry.getKey(), entry.getValue() + 100);
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        HashSet<Object> objects = new HashSet<>();
        objects.add("123");
        objects.add("123");
        TreeSet<Object> objects1 = new TreeSet<>();
        objects1.add(n1);
        objects1.add(n2);
        System.out.println(objects1);

    }
}

class News implements Comparable{
    private String title;
    private String content;

    @Override
    public String toString() {
        return "News{" +
                "content='" + content + '\'' +
                '}';
    }

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String processContent(String content) {
        if (content.length() > 15) {
            return content.substring(0, 15) + "...";
        }
        return content;
    }

    @Override
    public int compareTo(Object o) {
        return ((News)o).content.length()-this.content.length();
    }
}
