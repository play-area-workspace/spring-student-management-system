package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "John",
                        "johnrafael@gmail.com",
                        LocalDate.of(2000, Month.AUGUST, 8),
                        24
                ),
                new Student(
                        2L,
                        "Marie",
                        "marierogan7@gmail.com",
                        LocalDate.of(2002, Month.FEBRUARY, 17),
                        22
                )
        );
    }
}
