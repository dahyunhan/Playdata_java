package com.hdh.map;

import java.util.*;

public class HashMapTest {

    public HashMapTest() {
    }

    public static void hashMapTest() {
        //기본 타입 - 클래스타입 :  int - Integer / float - Float / boolean - Boolean / char - Character
        Map<String, Integer> map = new HashMap<>();
        //public class HashMap implements Map{} 이므로 HashMap 자체로 받아도 됨
        HashMap<String, Integer> hashMap = new HashMap<>();

        //데이터 추가
        //결과 -> a : 30
        map.put("a", 10);
        map.put("a", 20);
        map.put("a", 30);

        map.put("b", 40);
        map.put("c", 50);

        System.out.println(map.size());

        //데이터 추출 방법 - get(키)
        System.out.println(map.get("c"));

        //키 이름들만 알고싶음 - keySet(), return type : Set<키의 데이터 타입>
        //Set타입으로 반환되므로 타입 캐스팅 필요
        Set<String> set = map.keySet();
        //1. LinkedList로 추출 - List타입으로 반환 -> 무작위로 꺼내는 순서대로 인덱스 부여
        List<String> list = new LinkedList<>(set);
        for (String s : list) {
            System.out.println(s);
        }

        //2.Iterator(열거형) 객체 형태로 추출
        Iterator<String> iterator = set.iterator();
        //iterator.hasNext() - 추출할 수 있는 데이터 여부 확인 return type : boolean
        //iterator.next() - 데이터 추출
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void hashMapStudent() {
        Student s1 = new Student(10, "test1");
        Student s2 = new Student(20, "test2");
        Student s3 = new Student(30, "test3");
        Student s4 = new Student(40, "test4");

        System.out.println(s1.toString());

        Map<String ,Student>studentMap = new HashMap<>();
        studentMap.put("a", s1);
        studentMap.put("b", s2);
        studentMap.put("c", s3);
        studentMap.put("d", s4);

        System.out.println(studentMap);
    }
}
