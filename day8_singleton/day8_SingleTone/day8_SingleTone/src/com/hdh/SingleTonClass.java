package com.hdh;

public class SingleTonClass {
    //공유 객체 저장 변수

    public static SingleTonClass singleToneClass = null;

    private SingleTonClass() {
    }

//    public static SingleTonClass getInstance(){
//        singleToneClass = new SingleTonClass();
//        return singleToneClass;
//    }

    public static void getInstance() {
        singleToneClass = new SingleTonClass();

    }
}