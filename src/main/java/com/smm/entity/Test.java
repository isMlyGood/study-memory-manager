package com.smm.entity;

public class Test {
    private int id;
    private String test;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", test='" + test + '\'' +
                '}';
    }
}
