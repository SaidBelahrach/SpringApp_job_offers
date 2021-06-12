package Services;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Student;
import Models.User;
import Repositories.StudentRepository;
import Repositories.UserRepo; 
 
@Service
public class UserService {
	
	@Autowired
    private UserRepo repo;
	
	public List<User> listAll() {
        return repo.findAll();
    }
     
    public void save(User user) {
        repo.save(user);
    }
     
    public User get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
 
}