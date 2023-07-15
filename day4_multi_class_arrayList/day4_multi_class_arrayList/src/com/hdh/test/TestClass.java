package com.hdh.test;

public class TestClass {
	//default이므로 같은 패키지 내에서 접근 가능 
	int a =10;
	// 외부에서 접근 불가 
	private String name = "sss";
	//접근 제한 없음 
	public boolean b = true;
	
	public TestClass() {
		
	
	}

	public String getName() {
		return name;
	}

}
