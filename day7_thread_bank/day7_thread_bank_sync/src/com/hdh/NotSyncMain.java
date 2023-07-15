package com.hdh;

public class NotSyncMain {

    static Bank bank;

    public NotSyncMain() {
        bank = new Bank();

        System.out.println("현 잔액 : " + bank.getMoney());
        //입금 고객
        Me m = new Me();
        //출금 고객
        Wife w = new Wife();

        w.start();

        try {
            Thread.sleep(200);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
