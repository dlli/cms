package com.yc.cms.bean;

public class DemoBean {

    private String name;
    private String subject;
    private int age;

    @Override
    public String toString() {
        return "DemoBean{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
