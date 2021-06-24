package com.app.jobs.Repositories;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.jobs.Models.Student;
 


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}