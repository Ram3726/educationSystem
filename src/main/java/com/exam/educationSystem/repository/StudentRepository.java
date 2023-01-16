package com.exam.educationSystem.repository;

import com.exam.educationSystem.entity.StudentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentTable, Integer> {
}
