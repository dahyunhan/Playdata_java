package com.hdh;

import java.io.File;

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("main() 시작");

//        SleepThread s = new SleepThread();
//        s.start();

        RunnableTest runnableTest = new RunnableTest();
        new Thread(runnableTest).start();

//        RunnableClass t1 = new RunnableClass();
//        RunnableClass t2 = new RunnableClass();
//        RunnableClass t3 = new RunnableClass();

        //join()사용하려면 객체 생성 필요
//        new Thread(t1).start();
//        new Thread(t2).start();
//        new Thread(t3).start();

//        tt1.start();
//        tt2.start();
//        tt3.start();

//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
        System.out.println("main() 종료");

//        File f = new File();
    }
}


/*
        FakeThread t1 = new FakeThread();
        FakeThread t2 = new FakeThread();
        FakeThread t3 = new FakeThread();

        t1.start();
        t2.start();
        t3.start();
 */