package com.example.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.interview.InterviewApplication.fibonacci;

class InterviewApplicationTest {

    @Test
    void fibTest() {

        Assertions.assertEquals(0, fibonacci(0));
        Assertions.assertEquals(1, fibonacci(1));
        Assertions.assertEquals(832040, fibonacci(30));

    }
}