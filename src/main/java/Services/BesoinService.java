package Services;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Besoin;
import Models.Offre;
import Repositories.BesoinRepo;
import Repositories.OffreRepo; 
 
@Service
public class BesoinService {
	
	@Autowired
    private BesoinRepo repo;
	
	public List<Besoin> listAll() {
        return repo.findAll();
    }
     
    public void save(Besoin besoin) {
        repo.save(besoin);
    }
     
    public Besoin get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
 
}