package com.hdh;

//각각의 ARS 번호를 통해 1000원씩 누적하기
public class Account {

    private int total =0;
    public Account(){

    }

    public void deposit(){
        this.total = this.total+1000;
    }

    public int getTotal() {
        return total;
    }
}
