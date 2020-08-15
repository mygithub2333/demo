package com.gec.djexam.domain;

public class ExamRoom {
    private Integer id;

    private String examRoomNum;

    private String examRoomPlace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamRoomNum() {
        return examRoomNum;
    }

    public void setExamRoomNum(String examRoomNum) {
        this.examRoomNum = examRoomNum == null ? null : examRoomNum.trim();
    }

    public String getExamRoomPlace() {
        return examRoomPlace;
    }

    public void setExamRoomPlace(String examRoomPlace) {
        this.examRoomPlace = examRoomPlace == null ? null : examRoomPlace.trim();
    }
}