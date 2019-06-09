package by.htp.lib.dao;

import by.htp.lib.dao.impl.FileLibDAO;
import by.htp.lib.dao.impl.FileUserDAO;

public class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();
	
	private UserDAO userDAO = new FileUserDAO();
	private LibDAO libDAO = new FileLibDAO();
	
	
	
	private DAOProvider() {}
	
	public static DAOProvider getInstance() {
		
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public LibDAO getLibDAO() {
		return libDAO;
	}
	
	
}
