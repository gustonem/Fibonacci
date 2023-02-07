package com.example.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogsTest {

    @Test
    void getColorTest() {

        Dogs dog1 = new Dogs(5, "black");

        Assertions.assertEquals("black", dog1.getColor());
    }

    @Test
    void setAgeTest() {

        Dogs dog1 = new Dogs(5, "black");

        dog1.setAge(6);

        Assertions.assertEquals(6, dog1.getAge());

    }
}