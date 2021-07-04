package com.app.jobs.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.jobs.Models.User; 

public interface UserRepo extends JpaRepository<User, Integer> {
	User findByidFirebase(String idFirebase);
}
