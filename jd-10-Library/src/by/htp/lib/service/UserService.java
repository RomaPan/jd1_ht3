package by.htp.lib.service;

import by.htp.lib.entity.RegistrationInfo;
import by.htp.lib.entity.User;

public interface UserService {

	User logination(String login, String password);
	boolean registration(RegistrationInfo newUser);
}
