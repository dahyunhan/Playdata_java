package com.hdh;

import java.sql.SQLException;
import java.util.Scanner;

public class Service {


    public void print() {

        SQLClass sqlClass = new SQLClass();

        DBConnector dbConnector = new DBConnector();

        while (true) {

            System.out.println("원하는 작업번호를 입력해주세요..");
            System.out.println("1. 전체사원조회 / 2. 신규사원추가");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            if (n == 1) {
                sqlClass.selectAll();
                continue;

            } else if (n == 2) {
                sqlClass.insert();
                continue;
            } else if (n == 3) {
                sqlClass.update();
                continue;
            } else if (n == 4) {
                sqlClass.delete();
                continue;
            }
            System.out.println("서비스 종료");
            scanner.close();
            try {
                sqlClass.dbConnector.conn.close();
            } catch (SQLException e) {
                System.out.println("close err! : "+e.getMessage());
            }
            break;


        }

    }
}
