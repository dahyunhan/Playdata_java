package com.hdh;

import java.util.*;

import com.hdh.test.TestClass;

public class NewsMainClass {

	public static void main(String[] args) {

		NewsDataClass ndc = new NewsDataClass();

//		System.out.print("검색할 신문사 입력 : ");
//		Scanner scan = new Scanner(System.in);
//
//		String press = scan.next();
//		scan.close();
//		ArrayList<String> url = NewsMethodClass.NewsUrl(ndc.news, press);
//		NewsPrintClass.printUrl(press, url);

		ArrayList<String> categorys = NewsMethodClass.categorys(ndc.news);
		NewsPrintClass.printCategorys(categorys);

//		TestClass tc = new TestClass();
//		
//		//default - 다른 패키지에 존재하므로 접근 불가 
//		System.out.println(tc.a);
//		//public - 같은 프로젝트 내에 존재하므로 접근 가능 
//		System.out.println(tc.b);
//		//private - 다른 패키지, 다른 클래스에 존재하므로 접근 불가 -> getter로 꺼내오기 
//		System.out.println(tc.getName());

	}
}