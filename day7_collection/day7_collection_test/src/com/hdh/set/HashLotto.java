package com.hdh.set;

import java.util.*;

public class HashLotto {
    public HashLotto() {
    }

    public static void hashSetLotto() {
        HashSet<Integer> lotto = new HashSet<>();

        //무작위 6개 숫자 추출 후 저장
        //로또 번호 : 1~45
        //1. Math.random() -> 실수 타입 리턴
        //(int)Math.random() + 1
        //2.Random.Class nextInt(제일 큰 수); -> 정수 타입 리턴 / (3)이면 0,1,2
        Random r = new Random();
        for (int n = 0; lotto.size() < 6; n++) {
            int lottoNum = r.nextInt(45);
            lotto.add(new Integer(lottoNum + 1));
        }
        List<Integer> l = new LinkedList<>(lotto);
        Collections.sort(l);
        System.out.println(l);
    }

}
