package com.iyex.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }
    @GetMapping("/school/{schoolId}")
    public ResponseEntity<List<Student>> findAllStudentsOfSchool(@PathVariable Long schoolId){
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }
}
