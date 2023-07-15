package com.hdh;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		DataClass dc = new DataClass();

		ArrayList<Integer> ages = MethodClass.age(dc.members);
		int grades = MethodClass.grade(dc.students);

		PrintClass.prn(ages);
		PrintClass.prn(grades);

	}

}
