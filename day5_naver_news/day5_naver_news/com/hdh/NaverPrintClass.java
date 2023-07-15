package com.hdh;

import java.io.FileWriter;
import java.io.IOException;

public class NaverPrintClass {

    public NaverPrintClass() {
    }

    public static void saveHTML(String uri, String tags) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(uri);
            fw.write(tags);
        } catch (IOException e) {
            System.out.println("saveHTML : " + e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("saveHTML finally : " + e.getMessage());
            }

        }
    }
}
