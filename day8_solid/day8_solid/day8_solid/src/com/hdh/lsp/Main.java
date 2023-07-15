package com.hdh.lsp;

import com.hdh.srp.PM;
import com.hdh.srp.Person;
import com.hdh.srp.Programmer;


//Person, Programmer, PM
public class Main {

    public static void main(String[] args) {
        Person p1 = new Programmer();
        Person p2 = new PM();

        //슈퍼 클래스 타입으로 저장 받아도 서브 클래스에서 work()메소드 사용 가능
        p1.work();
        p2.work();

    }
}
