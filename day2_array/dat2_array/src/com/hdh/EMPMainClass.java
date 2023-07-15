package com.hdh;

public class EMPMainClass {

	public static void main(String[] args) {

		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
		String[] phone = { "010-8532-0537", "010-9672-5257", "010-9932-4536", "010-4117-0975", "011-8975-7892",
				"010-6251-6976", "010-9482-6059", "010-4845-0105", "010-6283-4849", "010-4510-1609" };
		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };
		int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };
		String[] code = { "JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE", "KR" };

		
		//남자 평균 나이 
		AgeAvg ageAvg  = new AgeAvg();

		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == 'M') {

				ageAvg.ageSum += age[i];
				ageAvg.count++;
			
			}
		}
		System.out.println("남자 평균나이 : "+ageAvg.avgMethod());
		
		
		
		//여자 평균 급여 
		PayAvg payAvg = new PayAvg();
		
		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == 'F') {

				payAvg.paySum += pay[i];
				payAvg.count++;
			
			}
		}
		System.out.println("여자 평균 급여 : "+payAvg.femelePayAvg());
		
		
		//일본 근무하는 사원의 이름, 전화번호 
		
//		String[] res = {};
		String res = "";
		  System.out.print("일본 근무하는 사원의 이름, 전화번호: ");
		for (int i = 0; i < code.length; i++) {
			if (code[i] == "JP") {

				
				res = name[i]+", "+phone[i]+" / ";
			
				System.out.print(res);
			}
		}
		
		
	}
	
	

}
