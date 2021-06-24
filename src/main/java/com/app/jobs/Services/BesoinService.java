//package com.app.jobs.Services;
//
// 
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.jobs.Models.Besoin;
//import com.app.jobs.Models.Offre;
//import com.app.jobs.Repositories.BesoinRepo;
//import com.app.jobs.Repositories.OffreRepo; 
// 
//@Service
//public class BesoinService {
//	
//	@Autowired
//    private BesoinRepo repo;
//	
//	public List<Besoin> listAll() {
//        return repo.findAll();
//    }
//     
//    public void save(Besoin besoin) {
//        repo.save(besoin);
//    }
//     
//    public Besoin get(int id) {
//        return repo.findById(id).get();
//    }
//     
//    public void delete(int id) {
//        repo.deleteById(id);
//    }
// 
//}