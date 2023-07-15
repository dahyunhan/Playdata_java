package com.hdh;
import java.util.*;


public class CafeMethodClass {

	public CafeMethodClass() {
		
	}
	
	public static ArrayList<String>item(ArrayList<CafeClass>cafes){
		ArrayList<String>items = new ArrayList<String>();
		int[] count = new int[items.size()];
		String temp = "";
	for(int i = 0;i<cafes.size();i++) {
		if(!temp.equals(cafes.get(i).getItem())) {
			items.add(temp);
		}
		
	
		
		
	
		
	}
		
		return items;
	}

}
