package Search;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends JpaRepository<UserBean, Integer> {

	@Query("select stuobj from UserBean stuobj where stuobj.user=?1")
	public UserBean findByName(String user);
}
