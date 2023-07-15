package com.hdh;

import java.util.*;

public class MethodClass {

	public MethodClass() {

	}

	// 메인메서드는 members[]전달
	public static ArrayList<Integer> age(ArrayList<MemberClass> members) {

		ArrayList<Integer> ages = new ArrayList<Integer>();

		for (int i = 0; i < members.size(); i++) {

			// 주민번호 앞자리 두 개
			String temp = members.get(i).getFirstNo().substring(0, 2);
			// 주민번호 자리 한 개
			String temp2 = members.get(i).getLastNo().substring(0, 1);

			int temp3 = Integer.parseInt(temp);

			if (temp2.equals("1") | temp2.equals("2")) {
				ages.add(2023 - (1900 + temp3));
			} else {
				ages.add(2023 - (2000 + temp3));
			}
		}

		return ages;
	}

	public static int grade(ArrayList<StudentClass> students) {
		int grades = 0;

		for (int i = 0; i < students.size(); i++) {
			grades += students.get(i).grade;

		}

		return grades;
	}
}
