package com.example.demo;

import java.util.List;
import java.util.Optional; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController; 

@RestController
 @CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
	@Autowired
	private StudentRepo repo;
	@GetMapping("/")
	public String Index() {
		repo.save(new Student(3,"Said","dedez",5));
		
		return "Index";
	}
	@GetMapping("Students")
	public List<Student> list(){ 
		return repo.findAll();
	}
	
	@GetMapping("/Students/{id}")
	public Optional<Student> find(@PathVariable("id") int id){ 
		return repo.findById(id);
	} 
	
	@PostMapping("/Students")
	public List<Student> add(@RequestBody  Student std ){  
		repo.save(std);	 
		System.out.println("added "+std.getStudentname());
		return repo.findAll(); 
	} 
	
	@PatchMapping("/Students")
	public List<Student> update(@RequestBody  Student std ){ 
		Student e= repo.findById(std.getId()).get();
		e.setStudentname("newwwwwwwwwww");
		repo.save(e);	 
		System.out.println("updated "+std.getId());
		return repo.findAll(); 
	} 
	@CrossOrigin
	@DeleteMapping("/Students/{id}")
	public List<Student> delete(@PathVariable int id )  { 
		repo.delete(repo.findById(id).get());
		System.out.println("deleted "+id);
		return repo.findAll();
	} 
}
