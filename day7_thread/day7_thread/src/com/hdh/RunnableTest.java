package com.hdh;

public class RunnableTest implements Runnable {
    int count = 0;
    int num = 0;
    boolean timeOut = false;

    public RunnableTest() {
    }

    public RunnableTest(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (!timeOut){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            num++;
            if(count>=num){
                timeOut = true;
            }
            System.out.println(Thread.currentThread().getName()+"       "+num);
        }
    }
}
