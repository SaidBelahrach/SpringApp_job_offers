package com.app.jobs.Services;
//package com.app.Services;
//
// 
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.Models.Offre;
//import com.app.Repositories.OffreRepo; 
// 
//@Service
//public class OffreService {
//	
//	@Autowired
//    private OffreRepo repo;
//	
//	public List<Offre> listAll() {
//        return repo.findAll();
//    }
//     
//    public void save(Offre offre) {
//        repo.save(offre);
//    }
//     
//    public Offre get(int id) {
//        return repo.findById(id).get();
//    }
//     
//    public void delete(int id) {
//        repo.deleteById(id);
//    }
// 
//}