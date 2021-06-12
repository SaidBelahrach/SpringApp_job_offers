package Repositories;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Student;
 


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}