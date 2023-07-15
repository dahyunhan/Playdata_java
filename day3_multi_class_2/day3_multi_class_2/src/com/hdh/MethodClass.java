package com.hdh;

import java.util.*;

public class MethodClass {

	public MethodClass() {

	}

	public static ArrayList<String> scearchTitle(ArrayList<BookClass> books, String scearchAuthor) {

		ArrayList<String> scearchTitles = new ArrayList<String>();

		for (int i = 0; i < books.size(); i++) {

			if (books.get(i).author.contains(scearchAuthor)) {
				scearchTitles.add(books.get(i).title);

			}
		}

		return scearchTitles;
	}

	public static ArrayList<Integer> lastPrice(ArrayList<BookClass> books) {
		ArrayList<Integer> lastPrices = new ArrayList<Integer>();

		for (int i = 0; i < books.size(); i++) {

			lastPrices.add((int) (books.get(i).price - (books.get(i).price * (books.get(i).dc / 100))));

		}

		return lastPrices;

	}

	public static ArrayList<String> title(ArrayList<BookClass> books) {

		ArrayList<String> titles = new ArrayList<String>();

		for (int i = 0; i < books.size(); i++) {

			titles.add(books.get(i).title);
		}
		return titles;
	}

}
