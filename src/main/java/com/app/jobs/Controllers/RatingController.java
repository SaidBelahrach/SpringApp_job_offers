package com.app.jobs.Controllers;    
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
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
import com.app.jobs.Repositories.OffreRepo;
import com.app.jobs.Repositories.RatingRepo;
import com.app.jobs.Repositories.UserRepo; 
  
@RestController
 @CrossOrigin(origins = "http://localhost:3000")
public class RatingController{
	@Autowired
	private RatingRepo ratingRepo; 
	@Autowired
	private UserRepo userRepo; 
	@Autowired
	private OffreRepo offreRepo; 

	@GetMapping("/ratings/byOfferId/{id}")
	public List<Rating> Index(@PathVariable int id){ 
		return offreRepo.findById(id).get().ratings; 
	}
	@PostMapping("/ratings")
	public List<Rating> add(@RequestBody  Rating rating ){  
		rating.setRated_offre(offreRepo.findById(rating.rated_offre.getIdService()).get());
		rating.setUser_rator(userRepo.findByidFirebase(rating.user_rator.getIdFirebase()));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));   
		rating.setDate(dtf.format(now) );
		System.out.println(rating);
		 ratingRepo.save(rating);	  
		return offreRepo.findById(rating.rated_offre.getIdService()).get().ratings; 
	} 
	@GetMapping("/ratings/{id}")
	public Optional<Rating> find(@PathVariable("id") int id){ 
		return ratingRepo.findById(id);
	} 
	 
	@PatchMapping("/ratings")
	public List<Rating> update(@RequestBody  Rating rating ){  
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
