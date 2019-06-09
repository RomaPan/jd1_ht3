package by.htp.lib.service.impl;

import by.htp.lib.dao.DAOProvider;
import by.htp.lib.dao.UserDAO;
//import by.htp.lib.dao.impl.FileUserDAO;
import by.htp.lib.entity.RegistrationInfo;
import by.htp.lib.entity.User;
import by.htp.lib.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public User logination(String login, String password) {
		//validation
		if(login == null || password == null) {
			throw new RuntimeException("data error");
		}
		
		DAOProvider provider = DAOProvider.getInstance();
		UserDAO userDAO = provider.getUserDAO();
		User user;
		
		user = userDAO.logination(login, password);
		
		
		return user;
	}

	@Override
	public boolean registration(RegistrationInfo newUser) {
		// TODO Auto-generated method stub
		
		
		
		return false;
	}

}
