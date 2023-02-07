package com.example.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

    @Test
    void getAgeTest() {
        Animals animal1 = new Animals(5);

        Assertions.assertEquals(5, animal1.getAge());
    }

    @Test
    void setAgeTest() {

        Animals animal1 = new Animals(5);
        animal1.setAge(6);

        Assertions.assertEquals(6, animal1.getAge());
    }
}