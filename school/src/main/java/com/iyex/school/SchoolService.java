package com.iyex.school;

import com.iyex.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class SchoolService {
    private final SchoolRepo schoolRepo;
    private final StudentClient studentClient;

    public void saveSchool(School school){
        schoolRepo.save(school);
    }

    public List<School> findAllSchools(){
        return schoolRepo.findAll();
    }

    public FullSchool findStudentsOfASchool(Long id) {
        var school = schoolRepo.findById(id).orElseThrow(()-> new NoSuchElementException("School with Id "+ id +" not found"));
        var students = studentClient.findAllStudentBySchool(id);
        return FullSchool.builder()
                .schoolName(school.getSchoolName())
                .username(school.getUsername())
                .students(students)
                .build();
    }
}
