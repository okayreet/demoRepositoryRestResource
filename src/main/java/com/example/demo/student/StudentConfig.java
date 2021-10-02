package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student kaz = new Student(
                    "Kazem",
                    "kazem@hotmail.com",
                    LocalDate.of(2003, Month.AUGUST, 25)
            );
            Student mo = new Student(
                    "Mo",
                    "Mo@hotmail.com",
                    LocalDate.of(1985, Month.AUGUST, 25)
            );

            studentRepository.saveAll(List.of(mo, kaz));
        };
    }


}
