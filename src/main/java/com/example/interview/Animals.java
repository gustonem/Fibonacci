package com.example.interview;

public class Animals {

    private int age;

    public Animals(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBaby() {
        return age <= 1;
    }
}
