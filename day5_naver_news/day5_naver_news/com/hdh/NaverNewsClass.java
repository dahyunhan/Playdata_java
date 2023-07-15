package com.hdh;

public class NaverNewsClass {

    String press = null;
    String image = null;
    String url = null;
    String category = null;

    public NaverNewsClass() {

    }

    public NaverNewsClass(String image, String url) {
        this.image = image;
        this.url = url;
    }


    public NaverNewsClass(String press, String image, String url, String category) {
        this.press = press;
        this.image = image;
        this.url = url;
        this.category = category;


    }

}

