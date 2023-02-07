package com.example.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.interview.InterviewApplication.fibbonaci;

class InterviewApplicationTest {

    @Test
    void fibTest() {

        Assertions.assertEquals(0, fibbonaci(0));
        Assertions.assertEquals(1, fibbonaci(1));
        Assertions.assertEquals(832040, fibbonaci(30));

    }
}