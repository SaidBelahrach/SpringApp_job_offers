package com.app.jobs.Controllers;   
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
import com.app.jobs.Models.Rating; 
import com.app.jobs.Repositories.RatingRepo; 
  
@RestController
 @CrossOrigin(origins = "http://localhost:3000")
public class RatingController{
	@Autowired
	private RatingRepo ratingRepo; 

	@GetMapping("/ratings")
	public List<Rating> Index(){ 
		 return ratingRepo.findAll();
	}
	@PostMapping("/ratings")
	public List<Rating> add(@RequestBody  Rating rating ){  
		ratingRepo.save(rating);	  
		return ratingRepo.findAll(); 
	} 
	@GetMapping("/ratings/{id}")
	public Optional<Rating> find(@PathVariable("id") int id){ 
		return ratingRepo.findById(id);
	} 
	 
	@PatchMapping("/ratings")
	public List<Rating> update(@RequestBody  Rating rating ){ 
		//Rating o= ratingRepo.findById(rating.getNum()).get(); 
		ratingRepo.save(rating);	 
		System.out.println("updated "+rating.getNum());
		return ratingRepo.findAll(); 
	} 
	@CrossOrigin
	@DeleteMapping("/ratings/{id}")
	public List<Rating> delete(@PathVariable int id )  { 
		ratingRepo.delete(ratingRepo.findById(id).get());
		System.out.println("deleted "+id);
		return ratingRepo.findAll();
	}	/* */
	 
}
