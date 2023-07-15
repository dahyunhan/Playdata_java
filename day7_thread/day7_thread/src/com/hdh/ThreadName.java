package com.hdh;

public class ThreadName extends Thread {

    public ThreadName() {
    }

    public ThreadName(String name) {
        super(name);
    }

    public void run() {
        //thread가 수행할 코드
        int i = 0;
        while (i < 50) {
            System.out.println(getName()+" -> "+i);
            i++;
        }
    }
}
