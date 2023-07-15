package com.hdh;

public class MemberClass {

	String pno = null;
	private String firstNo = null;
	private String lastNo = null;
	String pname = null;
	int cCode = 0;
	String pJob = null;
	int hireDate = 0;

	public MemberClass() {

	}

	public MemberClass(String pno, String jumin, String name, int n, String job, String h) {
		this.pno = pno;
		String[] temp = jumin.split("-");
		this.firstNo = temp[0];
		this.lastNo = temp[1];
		this.pname = name;
		this.pJob = job;
		this.hireDate = Integer.parseInt(h);

	}

	public String getFirstNo() {
		return firstNo;
	}

	public String getLastNo() {
		return lastNo;
	}

}
