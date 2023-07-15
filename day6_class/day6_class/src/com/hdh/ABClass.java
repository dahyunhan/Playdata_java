package com.hdh;

public abstract class ABClass {
    int a = 0;
    final boolean B = false;

    public ABClass() {
        System.out.println("ABClass 호출");
    }

    public void avg() {

    }

    //바디는 못가짐(선언만 가능)
    public abstract void prn();
}
