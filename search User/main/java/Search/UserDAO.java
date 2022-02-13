package Search;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;



@Service
public class UserDAO {
	@Autowired
	UserRepo repo;
	
	 HibernateTemplate temp;
	 public UserBean find(String user) {
		 return 	 repo.findByName(user);
		 
		 
	 }
	 public UserBean upate(UserBean b) {
		 UserBean existing= repo.findByName(b.getUser());
		    existing.setPassword(b.getPassword());
		    existing.setPhone(b.getPhone());
		    existing.setAddress(b.getAddress());
		    return repo.save(existing);
	 }
}
