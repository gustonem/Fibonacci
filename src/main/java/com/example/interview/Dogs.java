package com.example.interview;

public class Dogs extends Animals{

    private String color;

    public Dogs(int age, String color) {
        super(age);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isBaby() {
        return getAge() <= 2;
    }
}
