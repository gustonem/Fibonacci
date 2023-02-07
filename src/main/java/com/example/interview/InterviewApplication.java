package com.example.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
        System.out.println(fibonacci(30));
    }

    public static Long fibonacci(int n) {

        if (n == 0) {
            return 0L;
        }

        if (n == 1) {
            return 1L;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
