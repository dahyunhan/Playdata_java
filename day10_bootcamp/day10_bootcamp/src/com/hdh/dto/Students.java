package com.hdh.dto;


public class Students {
    @Override
    public String toString() {
        return "Students{" +
                "cName='" + cName + '\'' +
                ", cRating='" + cRating + '\'' +
                ", cJoinDate='" + cJoinDate + '\'' +
                ", cLastDate='" + cLastDate + '\'' +
                ", cVisitNo=" + cVisitNo +
                ", cPostNo=" + cPostNo +
                ", cCommentNo='" + cCommentNo + '\'' +
                ", cGenger='" + cGenger + '\'' +
                ", cAge='" + cAge + '\'' +
                '}';
    }

    private String cName = "";
    private String cRating = "";
    private String cJoinDate = "";
    private String cLastDate = "";
    private int cVisitNo = 0;
    private int cPostNo = 0;
    private int cCommentNo = 0;
    private String cGenger = "";
    private String cAge = "";

    /**
     * 기본 생성자
     **/

    /**
     * Overloading 생성자
     **/
    public Students(String cName, String cRating, String cJoinDate, String cLastDate, int cVisitNo, int cPostNo,
                    int cCommentNo, String cGenger, String cAge) {
        this.cName = cName;
        this.cRating = cRating;
        this.cJoinDate = cJoinDate;
        this.cLastDate = cLastDate;
        this.cVisitNo = cVisitNo;
        this.cPostNo = cPostNo;
        this.cCommentNo = cCommentNo;
        this.cGenger = cGenger;
        this.cAge = cAge;
    }

    public Students(String cName, String cAge, int cVisitNo) {
        this.cName = cName;
        this.cAge = cAge;
        this.cVisitNo = cVisitNo;
    }

    /**
     * Getter & Setter
     **/
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcRating() {
        return cRating;
    }

    public void setcRating(String cRating) {
        this.cRating = cRating;
    }

    public String getcJoinDate() {
        return cJoinDate;
    }

    public void setcJoinDate(String cJoinDate) {
        this.cJoinDate = cJoinDate;
    }

    public String getcLastDate() {
        return cLastDate;
    }

    public void setcLastDate(String cLastDate) {
        this.cLastDate = cLastDate;
    }

    public int getcVisitNo() {
        return cVisitNo;
    }

    public void setcVisitNo(int cVisitNo) {
        this.cVisitNo = cVisitNo;
    }

    public int getcPostNo() {
        return cPostNo;
    }

    public void setcPostNo(int cPostNo) {
        this.cPostNo = cPostNo;
    }

    public int getcCommentNo() {
        return cCommentNo;
    }

    public void setcCommentNo(int cCommentNo) {
        this.cCommentNo = cCommentNo;
    }

    public String getcGenger() {
        return cGenger;
    }

    public void setcGenger(String cGenger) {
        this.cGenger = cGenger;
    }

    public String getcAge() {
        return cAge;
    }

    public void setcAge(String cAge) {
        this.cAge = cAge;
    }
}