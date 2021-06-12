package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Student;

import Models.Demande;
import Models.User;

public interface DemandeRepo extends JpaRepository<Demande, Integer> {

}
