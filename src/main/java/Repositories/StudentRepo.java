package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
