package by.htp.treasure.command.impl;

import by.htp.treasure.command.Command;
import by.htp.treasure.controller.Controller;

public class CommandFindToSetPrice implements Command{
	Controller controller = new Controller();

	@Override
	public void doAction() {
		controller.findSetPrice();
		
	}

}
