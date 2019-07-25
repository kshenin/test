package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDAO {
	private List<User> users = Arrays.asList(new User("admin", "root"),
			 new User("user", "user"));
	
	public List<User> getAllUsers() {
		return users;
	}
}
