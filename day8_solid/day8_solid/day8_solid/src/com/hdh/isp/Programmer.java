package com.hdh.isp;

public class Programmer  extends Person{

    @Override
    public void work(){
    }

    //재정의(하지말기)
    @Override
    public void Eating(){
    }
    //재정의(하지말기)
    @Override
    public void Sleeping(){
    }
    //단독 사용할 메서드만 생성
    public void backDev(){
        System.out.println("백엔드");
    }
}
