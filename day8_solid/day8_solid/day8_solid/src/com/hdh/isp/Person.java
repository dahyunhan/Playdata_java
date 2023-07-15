package com.hdh.isp;

//기본 생성자 보유하지만 new키워드 이용하여 단독 객체 생성은 불가능 (추상 클래스기 때문)
public abstract class Person {
    public Person() {
    }

    //추상 메서드 선언까지만 가능
    public abstract void work();
/*
public void Eating();
public void Sleeping();
 */
    public void Eating() {
        System.out.println("먹어");
    }

    public void Sleeping() {
        System.out.println("잘자");
    }
}
