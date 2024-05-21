/*
package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    1L,
                    "John",
                    "johnrafael@gmail.com",
                    LocalDate.of(2000, AUGUST, 8)
            );
            Student marie = new Student(
                    "Marie",
                    "marierogan7@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 17)
            );

            repository.saveAll(List.of(john, marie));
        };
    }

}
*/
