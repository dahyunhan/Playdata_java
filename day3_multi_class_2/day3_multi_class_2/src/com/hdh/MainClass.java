package com.hdh;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		DataClass dc = new DataClass();

		System.out.print("저자 이름 검색 : ");
		Scanner scanner = new Scanner(System.in);
		String scearchAuthor = scanner.next();
		scanner.close();

		ArrayList<String> scearchTitles = MethodClass.scearchTitle(dc.bookClass, scearchAuthor);
		ArrayList<Integer> lastPrice = MethodClass.lastPrice(dc.bookClass);
		ArrayList<String> title = MethodClass.title(dc.bookClass);

		PrintClass.scearch(scearchTitles);
		PrintClass.prn(lastPrice, title);

	}

}
