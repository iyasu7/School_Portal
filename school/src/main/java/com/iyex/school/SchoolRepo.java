package com.iyex.school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School, Long> {
}