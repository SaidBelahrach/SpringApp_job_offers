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
import com.app.jobs.Models.Categorie; 
import com.app.jobs.Repositories.CategorieRepo; 
 
//de
@RestController
 @CrossOrigin(origins = "http://localhost:3000")
public class CategorieController{
	@Autowired
	private CategorieRepo CategorieRepo; 

	@GetMapping("/categories")
	public List<Categorie> Index(){ 
		 return CategorieRepo.findAll();
	}
	@PostMapping("/categories")
	public List<Categorie> add(@RequestBody  Categorie std ){  
		CategorieRepo.save(std);	  
		return CategorieRepo.findAll(); 
	} 
	@GetMapping("/categories/{id}")
	public Optional<Categorie> find(@PathVariable("id") int id){ 
		return CategorieRepo.findById(id);
	} 
	 
	@PatchMapping("/categories")
	public List<Categorie> update(@RequestBody  Categorie categorie ){ 
		Categorie o= CategorieRepo.findById(categorie.getIdCateg()).get(); 
		CategorieRepo.save(o);	 
		System.out.println("updated "+categorie.getIdCateg());
		return CategorieRepo.findAll(); 
	} 
	@CrossOrigin
	@DeleteMapping("/categories/{id}")
	public List<Categorie> delete(@PathVariable int id )  { 
		CategorieRepo.delete(CategorieRepo.findById(id).get());
		System.out.println("deleted "+id);
		return CategorieRepo.findAll();
	}	/* */
	 
}
