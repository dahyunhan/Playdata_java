package com.hdh;

public class TVContribution {

    static Account account;

    public static void main(String[] args) {
        account = new Account();

        Customer c1 = new Customer(account, "010-1111-2222");
        Customer c2 = new Customer(account, "010-3333-4444");
        Customer c3 = new Customer(account, "010-5555-6666");

        try {


            c1.start();
            c2.start();
            c3.start();

            c1.join();
            c2.join();
            c3.join();


        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("총 모금액 : " + account.getTotal());
    }
}
