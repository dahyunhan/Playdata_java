package com.hdh;

import java.util.*;

public class PrintClass {

	public PrintClass() {

	}

	public static void scearch(ArrayList<String> scearchTitles) {

		if(scearchTitles.size()==0) {
			System.out.println("해당 없음");
		}
		for (int i = 0; i < scearchTitles.size(); i++) {
			
		

			System.out.println(scearchTitles.get(i) + '\r');

		}

	}

	public static void prn(ArrayList<Integer> lastPrice, ArrayList<String> title) {
		for (int i = 0; i < lastPrice.size(); i++) {

			System.out.println(title.get(i) + "의 실제 판매가 : " + lastPrice.get(i) + "원");

		}

	}

}
