package by.htp.lib.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.lib.command.impl.AddNewBookCommand;
import by.htp.lib.command.impl.LoginationCommand;
import by.htp.lib.command.impl.RegistrationCommand;

public class CommandProvider {
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	public CommandProvider() {
		commands.put("logination", new LoginationCommand());
		commands.put("registration", new RegistrationCommand());
		commands.put("add_new_book", new AddNewBookCommand());
	}
	

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		
		return command;
	}
}
