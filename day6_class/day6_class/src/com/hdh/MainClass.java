package com.hdh;

import test.TestChildClass;


public class MainClass {
    public static void main(String[] args) {

//        ParentClass p = new ParentClass();
//        System.out.println(p.toString());
//
//        ChildClass c = new ChildClass();
//        System.out.println(c.toString());

//        TestChildClass c = new TestChildClass();
//        System.out.println(c.toString());
//
        ChildClass c = new ChildClass();

        A a = new InterfaceTestClass();

        //추상클래스의 생성자는 상속에서만 사용 가능
//        ABClass abClass = new ABClass() {
//        }

        ABChild abChild = new ABChild();


    }
}
