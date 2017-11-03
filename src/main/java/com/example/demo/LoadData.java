package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//@Component
public class LoadData implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(Arrays.asList(
                new Student("Elphas", "Khajira","1242")

        ));
    }
}
