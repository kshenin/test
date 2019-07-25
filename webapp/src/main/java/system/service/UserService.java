package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import system.dao.UserDAO;
import system.model.User;
import java.util.List;

public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	/*******************************************************
	 *	если что-то нужно будет расширить, то в этом классе *
	 *	Например: валидация пользователя                    *
	 *******************************************************/
	
	public List<User> getAllUserDAO() {
		return userDAO.getAllUsers();
	}
}
