package by.htp.lib.service;

import by.htp.lib.service.impl.LibServiceImpl;
import by.htp.lib.service.impl.UserServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {}
	
	private LibService libService = new LibServiceImpl();
	private UserService userService = new UserServiceImpl();
	
	
	public static ServiceProvider getInstance() {
		return instance;
	}


	public LibService getLibService() {
		return libService;
	}


	public UserService getUserService() {
		return userService;
	}
	
	
	
}
