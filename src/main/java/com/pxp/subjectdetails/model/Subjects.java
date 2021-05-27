package com.pxp.subjectdetails.model;

import java.util.List;

public class Subjects {

    private int rollNo;
    private List<String> subjects;

    public Subjects() {
    }

    public Subjects(int rollNo, List<String> subjects) {
        this.rollNo = rollNo;
        this.subjects = subjects;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
