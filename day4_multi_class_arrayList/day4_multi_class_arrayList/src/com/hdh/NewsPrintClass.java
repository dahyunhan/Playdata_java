package com.hdh;

import java.util.ArrayList;

public class NewsPrintClass {

	public NewsPrintClass() {

	}

	public static void printUrl(String press, ArrayList<String> url) {

		System.out.println(press + "의 링크 주소 : ");
		for (int i = 0; i < url.size(); i++) {
			// MacOS는 r
			System.out.print("https://" + url.get(i) + '\r');
		}

	}

	public static void printCategorys(ArrayList<String> categorys) {
		System.out.println("중복 제거한 카테고리 목록");
		for (int i = 0; i < categorys.size(); i++) {
			System.out.println(categorys.get(i));
		}
	}

}
