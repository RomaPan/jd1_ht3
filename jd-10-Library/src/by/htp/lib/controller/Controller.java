package by.htp.lib.controller;

import by.htp.lib.command.Command;
import by.htp.lib.command.CommandProvider;
//import by.htp.lib.entity.User;
//import by.htp.lib.service.ServiceProvider;
//import by.htp.lib.service.UserService;

public class Controller {
	
	private CommandProvider provider = new CommandProvider();
	

	public String doAction(String request) {//"logination login=aaa passowrd=bbb"
		String[] params = request.split("\\s+");
		String response = null;
		
		Command command = provider.getCommand(params[0]);
		response = command.execute(params);
		
		
		return response;
	}
	
	
}
