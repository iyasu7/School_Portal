package com.iyex.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class SchoolService {
    private final SchoolRepo schoolRepo;

    public void saveSchool(School school){
        schoolRepo.save(school);
    }

    public List<School> findAllSchools(){
        return schoolRepo.findAll();
    }

    public FullSchool findStudentsOfASchool(Long id) {
        var school = schoolRepo.findById(id).orElseThrow(()-> new NoSuchElementException("School with Id "+ id +" not found"));
//        var students = null;
        return null;
    }
}
