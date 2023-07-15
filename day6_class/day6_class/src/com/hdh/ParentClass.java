package com.hdh;

public class ParentClass {

    int a = 10;
    protected String name = "hdh";
    private boolean b = false;

    public char c = 'A';

    public ParentClass() {

    }

    public ParentClass(int n) {
        this.a = n;
        System.out.println("ParentClass 생성자 종료");
    }

    //Object 클래스(superClass)의 toString()을 재정의 -> Override
    public String toString() {

        String res = a + "    " + name;

        return res;
    }

}
