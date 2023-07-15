package com.hdh.srp;

public class Person {

    public String job;

    public Person(){

    }
    public String Person(String job) {
        return job;
    }

    public void work(){
        if(this.job.equals("Programmer")){
            System.out.println("코딩하는 새럼");
        }
        else if(this.job.equals("PM")){
            System.out.println("기획하는 새럼");
        }
    }




}
