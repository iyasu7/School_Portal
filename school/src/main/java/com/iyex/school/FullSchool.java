package com.iyex.school;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FullSchool {

    private String schoolName;
    private String username;
    private List<Student> students;
}
