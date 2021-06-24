package com.app.jobs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 

@SpringBootApplication
@RestController
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

//	@GetMapping("/api/")
//	public List<Student> hello() {  //@PathVariable(name="para") int para 
//		return List.of( new Student(1,"eee","ee",5),new Student(15,"sz","de",58));
//	}
}
