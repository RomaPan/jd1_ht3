package by.htp.lib.dao;

import by.htp.lib.entity.RegistrationInfo;
import by.htp.lib.entity.User;

public interface UserDAO {

	User logination(String login, String password);
	boolean registration(RegistrationInfo newUser);
	
}
