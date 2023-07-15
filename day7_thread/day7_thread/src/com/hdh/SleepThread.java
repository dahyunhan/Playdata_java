package com.hdh;

public class SleepThread extends Thread{

    public SleepThread(){
    }

    public void run(){
        System.out.println("sleep start");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("sleep end");
    }

}
