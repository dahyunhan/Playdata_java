package com.hdh;

import java.util.ArrayList;

public class NewsMethodClass {

	public NewsMethodClass() {

	}

	public static ArrayList<String> NewsUrl(ArrayList<NewsClass> news, String press) {
		ArrayList<String> url = new ArrayList<String>();

		for (int i = 0; i < news.size(); i++) {
			if (news.get(i).press.contains(press)) {

				url.add(news.get(i).url);

			}

		}
		return url;
	}

	public static ArrayList<String> categorys(ArrayList<NewsClass> news) {
		ArrayList<String> categorys = new ArrayList<String>();
		String temp = "";
		for (int i = 0; i < news.size(); i++) {

			if (!temp.equals(news.get(i).category)) {

				temp = news.get(i).category;
				categorys.add(temp);

			}

		}

		return categorys;
	}

}
