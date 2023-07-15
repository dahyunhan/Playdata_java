package com.hdh2;

public class MainClass {

	public static void main(String[] args) {

		String[] member=new String[3];
		
		member[0]="임재,20190509,20190510,8,남,30대후반";
		member[1]="성열,20190509,20190510,1,남,30대중반";
		member[2]="천재,20190509,20190510,3,남,30대초반";
		
		int num = member.length;
		EMPClass[] emp = new EMPClass[num];
		
		
		//idx -> 4 이면 null 익셉션 발생
		for (int idx = 0;idx<num ; idx++) {
			emp[idx] = new EMPClass(member[idx]);
			System.out.println(emp[idx].joinDate);
		}

	}

}




//미션 회원 성비