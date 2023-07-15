package com.hdh;

public class javaEx2 {

	public static void main(String[] args) {
		
		String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		int[] pay={460,200,250,300,300,200,350,200,400,440};
		
		for(int i=0; i<name.length;i++) {
			
			if(300==pay[i]) {
				System.out.print(name[i]+" ");
			}
		}
	}

}
