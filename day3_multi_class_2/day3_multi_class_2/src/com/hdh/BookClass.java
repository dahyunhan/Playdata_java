package com.hdh;

public class BookClass {

	String title = null;
	String author = null;
	private String press = null;
	int price = 0;
	String image = null;
	double dc = 0;

	public BookClass() {

	}

	public BookClass(String title, String author, String press, int price, String image, double dc) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
		this.image = image;
		this.dc = dc;
	}

	public String getPress() {
		return press;
	}

}