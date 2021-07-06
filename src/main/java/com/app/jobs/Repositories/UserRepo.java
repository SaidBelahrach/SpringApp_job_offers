package com.app.jobs.Repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.jobs.Models.User; 

public interface UserRepo extends JpaRepository<User, Integer> {
	List<User> findByidFirebase(String idFirebase);
}
