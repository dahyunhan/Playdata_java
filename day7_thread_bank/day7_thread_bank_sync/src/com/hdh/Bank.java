package com.hdh;

public class Bank {

    public Bank() {

    }


    public synchronized void saveMoney(int money) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }


}
