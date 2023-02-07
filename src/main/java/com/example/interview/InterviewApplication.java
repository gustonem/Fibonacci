package com.example.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class InterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
        System.out.println(fibonacci(30));


        List<Dogs> dogs = new ArrayList<Dogs>();

        dogs.add(new Dogs(5, "black"));
        dogs.add(new Dogs(1, "brown"));
        dogs.add(new Dogs(2, "grew"));


        dogs = dogs.stream().filter(Dogs::isBaby).toList();


        System.out.println(dogs);
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
