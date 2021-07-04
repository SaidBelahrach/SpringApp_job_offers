package com.app.jobs.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.jobs.Models.Rating; 

public interface RatingRepo extends JpaRepository<Rating, Integer> {

}
