package com.hdh.list;

import java.util.ArrayList;

public class ArrayListTest {

    public ArrayListTest() {
    }

    public static void arrayListTest() {
        ArrayList<String> list = new ArrayList<>();
        //기본으로 마지막에 추가
        list.add("a");
        list.add("b");
        list.add("c");

        //인덱스 지정하여 값 추가, 나머지 데이터는 하나씩 뒤로 밀림
        list.add(1, "d");

        //특정 위치의 데이터를 다른 데이터로 변경
        list.set(2, "f");

        //특정 위치의 데이터를 제거
        list.remove(0);

        //특정 위치의 데이터를 제거도하고 반환도 받고싶음
        String res = list.remove(0);

        //특정 데이터의 인덱스 알고싶음 -> 첫 인덱스부터 검색
        int idx = list.indexOf("f");
        //똑같은 데이터가 다른 인덱스에도 존재한다면 -> 마지막 인덱스부터 겁색
        int idx1 = list.lastIndexOf("f");

        //전체 데이터를 조회하는 방법
        //1. for(int i = 0; i < ArrayList.size(); i++ )
        for(int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        };
        //2. for(내부 데이터 타입 : ArrayList 객체)
        for(String  s : list){
            System.out.println(s);
        };

    }
}
