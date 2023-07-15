package com.hdh;

public class FakeThread {
    public FakeThread() {

    }

    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println(" --> " + i);
            i++;
        }
    }

    public void start() {
        run();
    }
}
