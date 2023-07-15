package com.hdh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NaverDataClass {

    ArrayList<NaverNewsClass> news = new ArrayList<>();

    public NaverDataClass() {
    }

    public NaverDataClass(String uri) {

        this.readData(uri);
    }

    public void readData(String uri) {
        //파일 읽기 - FileReader, BufferedReader
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(uri);
            br = new BufferedReader(fr);

            String temp = "";
            String[] split = null;
            while ((temp = br.readLine()) != null) {

                split = temp.split("\", \"");
                news.add(new NaverNewsClass(split[1], split[2]));
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        }
    }
}
