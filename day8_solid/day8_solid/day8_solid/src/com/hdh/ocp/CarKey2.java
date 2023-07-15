package com.hdh.ocp;

public interface CarKey2 {
    public void open();

    public void lock();

    public void turnOn();

    public void turnOff();


    class key implements CarKey2 {

        public key() {
        }



        @Override
        public void open() {
            System.out.println("스마트키로 열기");
        }

        @Override
        public void lock() {

        }

        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }

    }
}
