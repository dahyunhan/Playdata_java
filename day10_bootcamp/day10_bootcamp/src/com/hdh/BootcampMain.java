package com.hdh;

import com.hdh.db.MySQLconnector;

public class BootcampMain {
    public static void main(String[] args) {
MySQLconnector mySQLconnector = new MySQLconnector();
mySQLconnector.connectMySQL();
//mySQLconnector.selectAll();

//        mySQLconnector.ageVisit();
mySQLconnector.overAvg();
    }
}
