package com.hdh.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public HashSetTest() {
    }

    public static void hashSetTest() {
        //Set<String> set = new HashSet<>(); - 동일
        HashSet<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        System.out.println(set.size());

        //Iterator로 변환 -> Set.iterator() 메서드 사용(set이 갖고 있음)
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
