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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.jobs.Models.Offre;
import com.app.jobs.Models.Rating;
import com.app.jobs.Models.Statis;
import com.app.jobs.Models.User; 
import com.app.jobs.Repositories.UserRepo; 
@RestController
 @CrossOrigin(origins = "http://localhost:3000")
public class UserController { 
	@Autowired
	private UserRepo userRepo;   
	
	@GetMapping("/users")
	public List<User> Index(){ 
		 return userRepo.findAll();
	} 
	@GetMapping("/users/statistics/{id}")
	public Statis statistics(@PathVariable int id){ 
		User user=userRepo.findById(id).get();
		 float t=0;
		 int i=0;
		for (Offre o : user.user_offres  ) {
			for (Rating r : o.ratings ) {
				t+=r.getPoints();
				i++;
			} 
		}
		System.out.println(i+" "+t);
		Statis statis=new Statis(user.user_offres.size(), t/i);
		return statis;
	} 
	
	@GetMapping("/users/getuser")
	public Optional<User> getUserByidFirebase(@RequestParam("idFirebase") String idFirebase){ 
		return Optional.ofNullable(userRepo.findByidFirebase(idFirebase));
	}
	@CrossOrigin
	@PostMapping("/users")
	public List<User> add(@RequestBody  User user ){  
		try {
			userRepo.save(user);	  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return userRepo.findAll(); 
	} 
//	
	@PatchMapping("/users")
	public List<User> update(@RequestBody  User user){ 
//		Offre user= userRepo.findById(user.getIdService()).get();
//		o.setNom("newwwwwwwwwww");
//		userRepo.save(o);	 
//		System.out.println("updated "+offre.getIdService());
		userRepo.save(user);
		return userRepo.findAll(); 
	} 
	@CrossOrigin
	@DeleteMapping("/users/{id}")
	public List<User> delete(@PathVariable int id )  { 
		userRepo.delete(userRepo.findById(id).get());
		System.out.println("deleted "+id);
		return userRepo.findAll();
	}	/* */
//	@CrossOrigin
//	@PostMapping(value = "/users", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public ResponseEntity  uploadFile(@RequestParam("file") MultipartFile file,
//    								  @RequestParam("nom") String nom,
//    								  @RequestParam("descri") String descri,
//    								  @RequestParam("address") String address,
//    								  @RequestParam("categorie") String categorie,
//    								  @RequestParam("prix") String prix) { 
//		if(!file.isEmpty()) {
//			// Get the file name, including the suffix			
//			String fileName = file.getOriginalFilename();
//			File currDir = new File(""); 
//			String path =currDir.getAbsolutePath()+"\\src\\main\\resources\\static\\uploads\\";//"C:\\Users\\said.leader\\eclipse-workspace\\spring_app\\src\\main\\resources\\static\\uploads\\";
//
//			System.out.println(nom+ descri+address);
//			try {
//				 // This method is a package for writing files. In the util class, import the package and use it. The method will be given later				
//				FileUtil.fileupload(file.getBytes(), path , fileName);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
//			String[] imgs = new String[]{"http://localhost:8080/"+fileName};
//			Offre o=new Offre(0, nom, prix, descri,imgs);
//			o.categorie=CategorieRepo.findById(Integer.parseInt(categorie)).get(); 
//			o.creator=useruserRepo.findById(1).get(); 
//			
//			userRepo.save(o);	 
//			System.out.println("added "+o.getNom());
////			 
//			 // Then create the corresponding entity class, add the following path, and then write through the database operation method			
//			//FilePath biaopath = new FilePath();
//			//biaopath.setPath("http://localhost:8080/"+fileName);
//		//	filePathRepository.save(biaopath);
//			
//		} 
//		
//		
//        logger.info(String.format("File name '%s' uploaded successfully.", file.getOriginalFilename()));
//        return ResponseEntity.ok().build();
//    }
//	 
}
