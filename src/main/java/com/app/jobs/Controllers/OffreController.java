package com.app.jobs.Controllers;  
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional; 
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
 
import com.app.jobs.Models.FileUtil;
import com.app.jobs.Models.Offre;
import com.app.jobs.Repositories.CategorieRepo;
import com.app.jobs.Repositories.OffreRepo;
import com.app.jobs.Repositories.UserRepo;

import ch.qos.logback.classic.Logger;
 //de
@RestController
 @CrossOrigin(origins = "http://localhost:3000")
public class OffreController {
	@Autowired
	private OffreRepo repo;  
	
	@Autowired
	private UserRepo userRepo;  

	@Autowired
	private CategorieRepo CategorieRepo; 
	 private static final Logger logger = (Logger) LoggerFactory.getLogger(CategorieController.class);
	 
	@GetMapping("offres")
	public List<Offre> Index(){ 
		 return repo.findAll();
	}
	
	@GetMapping("/offres/{id}")
	public Optional<Offre> find(@PathVariable("id") int id){ 
		return repo.findById(id);
	} 
	
//	@PostMapping("/offres")
//	public List<Offre> add(@RequestBody  Offre offre ){  
//		repo.save(offre);	 
//		System.out.println("added "+offre.getNom());
//		return repo.findAll(); 
//	} 
//	
	@CrossOrigin
	@PatchMapping("/offres")
	public List<Offre> update(@RequestParam("file") MultipartFile file,
			  @RequestParam("idService") int idService,
			  @RequestParam("nom") String nom,
			  @RequestParam("descri") String descri,
			  @RequestParam("address") String address,
			  @RequestParam("categorie") String categorie,
			  @RequestParam("creatorID") String creatorID,
			  @RequestParam("prix") String prix) { 
		if(!file.isEmpty()) {
		String fileName = file.getOriginalFilename();
		File currDir = new File(""); 
		String path =currDir.getAbsolutePath()+"\\src\\main\\resources\\static\\uploads\\";//"C:\\Users\\said.leader\\eclipse-workspace\\spring_app\\src\\main\\resources\\static\\uploads\\";
		
		try {
		// This method is a package for writing files. In the util class, import the package and use it. The method will be given later				
			FileUtil.fileupload(file.getBytes(), path , fileName);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		String[] imgs = new String[]{"http://localhost:8080/"+fileName};
		Offre o=repo.findById(idService).get();
		o.setImgs(imgs);
		o.setAddress(address);
		o.setDescri(descri);
		o.setNom(nom);
		o.setPrix(prix); 
		System.out.println(o);
		try {
			o.categorie=CategorieRepo.findById(Integer.parseInt(categorie)).get(); 
			o.creator=userRepo.findByidFirebase(creatorID); 
			repo.save(o);	 	 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		}  
		logger.info(String.format("File name '%s' uploaded successfully.", file.getOriginalFilename()));
		 return repo.findAll();
}
	
//	
//	(@RequestBody  Offre offre ){ 
//		Offre o= repo.findById(offre.getIdService()).get();
//		o.setNom("updated "+offre);
//		repo.save(o);	 
////		System.out.println("updated "+offre.getIdService());
//		return repo.findAll(); 
//	} 
	@CrossOrigin
	@DeleteMapping("/offres/{id}")
	public List<Offre> delete(@PathVariable int id )  { 
		repo.delete(repo.findById(id).get());
		System.out.println("deleted "+id);
		return repo.findAll();
	}	 
	@CrossOrigin
	@PostMapping(value = "/offres", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity  add(@RequestParam("file") MultipartFile file,
    								  @RequestParam("nom") String nom,
    								  @RequestParam("descri") String descri,
    								  @RequestParam("address") String address,
    								  @RequestParam("categorie") String categorie,
    								  @RequestParam("creatorID") String creatorID,
    								  @RequestParam("prix") String prix) { 
 
		if(!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			File currDir = new File(""); 
			String path =currDir.getAbsolutePath()+"\\src\\main\\resources\\static\\uploads\\";//"C:\\Users\\said.leader\\eclipse-workspace\\spring_app\\src\\main\\resources\\static\\uploads\\";
 
			try {
				 // This method is a package for writing files. In the util class, import the package and use it. The method will be given later				
				FileUtil.fileupload(file.getBytes(), path , fileName);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			String[] imgs = new String[]{"http://localhost:8080/"+fileName};
			Offre o=new Offre(0, nom, prix, descri,imgs);
			try {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
				LocalDateTime now = LocalDateTime.now();  
				System.out.println(dtf.format(now));   
				o.setDate(dtf.format(now) );
				o.categorie=CategorieRepo.findById(Integer.parseInt(categorie)).get(); 
				o.creator=userRepo.findByidFirebase(creatorID); 
				repo.save(o);	 	
				System.out.println("added "+creatorID +"------"+o.creator);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}  
        logger.info(String.format("File name '%s' uploaded successfully.", file.getOriginalFilename()));
        return ResponseEntity.ok().build();
    }
	 
}
