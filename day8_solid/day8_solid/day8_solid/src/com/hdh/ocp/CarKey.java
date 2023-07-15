package com.hdh.ocp;

//메인 클래스
public class CarKey {

    carA myCar;

    public CarKey() {

    }

    public CarKey(carA car) {
        this.myCar = car;
    }

    public void open() {
        System.out.println("문열림");
    }

    public void turnOn() {
        System.out.println("시동 걸림");
    }

    public void turnOff() {
        System.out.println("시동 끔");
    }

    public void lock() {
        System.out.println("문닫힘");
    }

    //서브 클래스
    class carA {
        public carA() {

        }

    }
}
