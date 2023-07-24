package com.iyex.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {
    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(@RequestBody School school){
        schoolService.saveSchool(school);
    }

    @GetMapping
    public List<School> findAllSchools(){
        return schoolService.findAllSchools();
    }
    @GetMapping("/{schoolId}/students")
    public FullSchool findAllStudentOfASchool(@PathVariable Long schoolId){
        return schoolService.findStudentsOfASchool(schoolId);
    }
}
