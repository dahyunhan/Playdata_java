package com.hdh;

import java.util.*;
//추후HTML로 대체 예정 

public class PrintClass {

	// 기본생성자
	public PrintClass() {

	}

	// 사용자 정의 메소드
	public static void prn(ArrayList<Integer> ages) {
		System.out.print("교수 나이 : ");
		for (int i = 0; i < ages.size(); i++) {
			System.out.print(ages.get(i) + " ");
		}
	}

	// 오버로딩 가능
	public static void prn(int grades) {

		System.out.println('\r' + "학생 성적의 합 : " + grades);

	}
}
