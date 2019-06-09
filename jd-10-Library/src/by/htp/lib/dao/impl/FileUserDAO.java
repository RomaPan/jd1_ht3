package by.htp.lib.dao.impl;

import by.htp.lib.dao.UserDAO;
import by.htp.lib.entity.RegistrationInfo;
import by.htp.lib.entity.User;

public class FileUserDAO implements UserDAO{
	
	
	@Override
	public User logination(String login, String password) {
//		try {
//			
//		}
//		catch(IOException e) {
//			
//		}
		
		
		return new User();
	}

	@Override
	public boolean registration(RegistrationInfo newUser) {
		// TODO Auto-generated method stub
		return false;
	}

}
