package by.htp.lib.command.impl;

import by.htp.lib.command.Command;
import by.htp.lib.entity.User;
import by.htp.lib.service.ServiceProvider;
import by.htp.lib.service.UserService;

public class LoginationCommand implements Command{

	@Override
	public String execute(String[] params) {
		String login;
		String password;
		
		String response;
		
		login = params[1].split("=")[1];
		password = params[2].split("=")[1];
		
		ServiceProvider provider = ServiceProvider.getInstance();
		
		UserService userService = provider.getUserService();
		User user = userService.logination(login,password);
		
		if (user != null) {
			response = "Hello, " + user.getName();
		} else {
			response = "error";
		}
		
		
		return response;
	}

}
