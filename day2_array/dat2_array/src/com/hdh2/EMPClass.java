package com.hdh2;

public class EMPClass {
	
	String name;
	String joinDate;
	String lastVisitDate;
	int numVisit;
	String gender;
	String age;
	
	public EMPClass(String str) {
		String[] split = str.split(",");
		
		name = split[0];
		joinDate = split[1];
		lastVisitDate = split[2];
		numVisit = Integer.parseInt(split[3]);
		gender = split[4];
		age = split[5];
	}

}
