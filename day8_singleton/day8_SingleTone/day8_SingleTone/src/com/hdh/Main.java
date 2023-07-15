package com.hdh;

public class Main {
    public static void main(String[] args) {

        //new 키워드로 객체 생성 불가(private 걸어놨음)
        //1. 생성된 객체를 리턴받음
//        SingleTonClass s = SingleTonClass.getInstance();

        //2. 생성된 객체를 리턴받지 않음
        SingleTonClass.getInstance();

        //익명(이름 없는) 객체를 이용
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("run");
            }
        }).start();


        //람다 표현식 -> 화살표 사용 (자바 9부터 지원)
        //Runnable을 익명 개체로 사용
        new Thread(() -> {
            System.out.println("!!");
        }).start();

    }

    //cal을 익명 개체로 사용
    Func add = (int a, int b) -> a + b;
}

interface Func {
    public int cal(int n1, int n2);
}