package com.in28minutes.learnspringframework.pojovsbean;

import java.io.Serializable;

class Pojo {
    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }
}

class JavaBean implements Serializable {     // EJB -- Enterprise Java Beans
    // 1. Must have a public no-args constructor
    // 2. Must have getters and setters
    // 3. Must be serializable (implement Serializable interface)
    private String text;
    private int number;

    public JavaBean() {
    }

    public JavaBean(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return text + ":" + number;
    }
}

public class SpringBeanVsJavaBean {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }
}
