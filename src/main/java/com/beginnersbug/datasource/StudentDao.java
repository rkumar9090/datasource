package com.beginnersbug.datasource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beginnersbug.datasource.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
