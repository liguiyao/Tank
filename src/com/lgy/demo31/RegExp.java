package com.lgy.demo31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String content = "《解忧杂货店》于2012年获得第七届中央公论文艺奖 [2]  、苹果日报翻译小说销售排行榜连续两季第二名，荣登纪伊国屋、诚品、博客来、金石堂各大排行榜第1名。 [15] \n" +
                "2015年10月29日，英皇电影及万达电影正式宣布获得《解忧杂货店》的华语电影及电视版权，电影预计将于2016年开始拍摄，并于2017年上映。 [4] \n" +
                "2015年12月10日，亚马逊中国发布2015年度图书排行榜。《解忧杂货店》仅次于《秘密花园》，位列位列畅销图书榜第二名。";

        String regStr = "\\d\\d\\d\\d";
        //创建模式对象
        Pattern pattern = Pattern.compile(regStr);
        //创建匹配器
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

    }
}
