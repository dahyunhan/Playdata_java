package com.hdh.srp;

public class SRP {

    public SRP() {
    }

    //클래스 내부에 클래스 선언 가능 (접근제한자 사용 가능)
    public class InnerClass {

        public void method() {
            class InnerMethod {

            }
        }
    }

    //서브 클래스는 접근제한자 사용 X public도 포함(추상메소드는 가능)
    abstract class Person2 {
        public abstract void work();
    }

//    class Programmer extends Person2 {
//        @Override
//        public void work() {
//            System.out.println("코딩");
//        }
//    }
//
//    class PM extends Person2 {
//        @Override
//        public void work() {
//            System.out.println("기획");
//        }
//    }
}
