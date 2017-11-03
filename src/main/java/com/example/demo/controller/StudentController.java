package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "students",produces={MediaType.APPLICATION_JSON_VALUE})
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @PostMapping
    public Student createStudent(@RequestBody  Student student){
        return studentRepository.save(student);
    }
    @GetMapping
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping(value="search")
    public List<Student> search(@RequestParam String firstName){
        return studentRepository.findByFirstNameContainingIgnoreCase(firstName);
    }
    @GetMapping(value = "{id}")
    public Student findById(@PathVariable Long id){
        return studentRepository.findOne(id);
    }

    @DeleteMapping
    public void  deleteStudents(@PathVariable Long id){
        studentRepository.delete(id);
    }
    @PatchMapping
    public  Student updateStudent(@PathVariable Long id){
        return null;
    }
}
