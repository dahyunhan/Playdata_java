package com.hdh;

public class Customer extends Thread {

    Account account = null;

    public Customer() {

    }

    public Customer(Account account, String name) {
        this.account = account;
        setName(name);
    }

    public void run() {
        for (int i = 0; i <= 200; i++) {
            System.out.println(getName() + " : " + i + "번째");

            this.account.deposit();
            //전체 모금액 : 50만원
            if (account.getTotal() >= 500000) {
                break;
            }
        }
    }
}
