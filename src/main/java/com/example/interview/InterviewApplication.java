package com.example.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
        System.out.println(fibbonaci(30));
    }

    public static int fibbonaci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibbonaci(n - 1) + fibbonaci(n - 2);
    }

}
