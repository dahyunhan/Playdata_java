package com.hdh;

public class InterfaceTestClass implements A, B {
    int ccc = 0;

    public InterfaceTestClass() {

        // a=100; -> 값 변경 불가 그러나 추출은 가능
    }


    @Override
    public void sum() {
        System.out.println("A");
    }
}
