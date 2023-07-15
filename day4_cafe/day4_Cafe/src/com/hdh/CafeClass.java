package com.hdh;

public class CafeClass {

	private String order_id = null;
	private String order_date = null;
	private String category = null;
	private String item = null;
	private int price = 0;

	public CafeClass() {

	}

	public CafeClass(String order_id, String order_date, String category, String item, int price) {
		this.order_id = order_id;
		this.order_date = order_date;
		this.category = category;
		this.item = item;
		this.price = price;
	}

	public String getOrder_id() {
		return order_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public String getCategory() {
		return category;
	}

	public String getItem() {
		return item;
	}

	public int getPrice() {
		return price;
	}

}
