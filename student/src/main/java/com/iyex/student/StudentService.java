package com.iyex.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    public List<Student> findAllStudentsBySchool(Long id) {
        return studentRepo.findBySchoolId(id);
    }
}
