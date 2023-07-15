package com.hdh;

public class NaverMainClass {

    public static void main(String[] args) {
        String uri = "/Users/dahyun/encore/intelliJ/day5_naverNews_fileReader/naver_news_stand_data_edit.txt";
        com.hdh.NaverDataClass naver = new com.hdh.NaverDataClass(uri);
//        System.out.println(+naver.news.size());
//        System.out.println(naver.news.get(94).image);
//        System.out.println(naver.news.get(94).url);


        String tags = com.hdh.NaverMethodClass.createHTML(naver.news);
        System.out.println(tags);

        String uri2 = "/Users/dahyun/encore/intelliJ/day5_naverNews_fileReader/firstWebPage.html";
        com.hdh.NaverPrintClass.saveHTML(uri2, tags);
    }
}
