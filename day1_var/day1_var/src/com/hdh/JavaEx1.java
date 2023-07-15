package com.hdh;

public class JavaEx1 {

	public static void main(String[] args) {

		int[] age={27,34,28,26,41,28,42,29,29,32};
			
		
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<age.length;i++) {
			
			sum +=age[i];
			
		}
		
		
		double avg = sum/age.length;
		
		for(int j = 0; j<age.length;j++) {
			
			if (avg<age[j]) {
				count++;
			}
		}
		
		System.out.println(sum+" "+avg+" "+count);
			
	}

}
