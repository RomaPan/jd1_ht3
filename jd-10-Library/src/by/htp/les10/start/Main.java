package by.htp.les10.start;

import by.htp.les10.view.View;
import by.htp.lib.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		View view = new View();
		view.setController(controller);
		
		view.show();
		
		

	}

}
