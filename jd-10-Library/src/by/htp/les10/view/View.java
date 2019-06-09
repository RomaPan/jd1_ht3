package by.htp.les10.view;

import by.htp.lib.controller.Controller;

public class View {
	
	private Controller controller;
	
	public void setController(Controller controller) {
		this.controller = controller;
	}

	public int loginMenu() {
		return 1;
	}
	
	public int authUserMenu() {
		return 3;
	}
	
	public String askLoginInfo() {
		return "";
	}
	
	public String askNewBookInfo() {
		return "";
	}
	
	public boolean displayLoginationAnswer(String response) {
		boolean isError = true;
		
		if (isError) {
			System.out.println(response);
		}else {
			System.out.println(response);
		}
		
		return isError;
	}
	
	
	
	public void show() {
		int userCh = -1;
		String req;
		String resp;
		boolean isError;
		
		do {
			if(userCh < 0) {
				userCh = loginMenu();
				switch(userCh) {
				case 1:
					req = askLoginInfo();
					resp = controller.doAction(req);
					isError = displayLoginationAnswer(resp);
					
					if (isError) { userCh = -1;}
					break;
				case 2:
					req = askNewBookInfo();
					resp = controller.doAction(req);
					isError = displayLoginationAnswer(resp);
					
					userCh = -1;
					break;
				}
				
				
			}else {
				//doAuthorisation menu etc...
			}
		}while (userCh !=0);
		
	}
}
