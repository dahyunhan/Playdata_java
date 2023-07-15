package com.hdh.map;

public class Student {
    private int sno;
    private String sname;

    public Student(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
