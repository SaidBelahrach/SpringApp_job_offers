package Services;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Models.Offre; 
import Repositories.OffreRepo; 
 
@Service
public class OffreService {
	
	@Autowired
    private OffreRepo repo;
	
	public List<Offre> listAll() {
        return repo.findAll();
    }
     
    public void save(Offre offre) {
        repo.save(offre);
    }
     
    public Offre get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
 
}