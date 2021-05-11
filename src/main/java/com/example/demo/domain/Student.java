package com.example.demo.domain;

/**
 * @Description:
 * @Author yxc
 * @Date 2021/4/24 23:13
 */
public class Student {
    //名字
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    //性别
    private String sex;
    //薪水
    private int salary;
    //年龄
    private int age;
    //星座
    private String star;

    public Student(String name, String sex, int salary, int age, String star) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.age = age;
        this.star = star;
    }
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name,int age,int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Student() {
    }
}
