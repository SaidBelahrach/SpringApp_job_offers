package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Student;

import Models.Besoin;
import Models.Categorie;
import Models.User;
import Models.Offre; 

public interface BesoinRepo extends JpaRepository<Besoin, Integer> {

}
