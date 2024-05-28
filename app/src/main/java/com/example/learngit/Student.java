package com.example.learngit;

public class Student {
    private int name;
    private int gpa;
    private String birthday;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getGpa() {
        return gpa;
    }
}
