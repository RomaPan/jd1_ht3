package by.htp.treasure.view;

import java.util.Scanner;

import by.htp.treasure.command.impl.CommandDisplayAll;
import by.htp.treasure.command.impl.CommandFindByPrice;
import by.htp.treasure.command.impl.CommandFindMostExpensive;
import by.htp.treasure.command.impl.CommandFindToSetPrice;


public class ViewTreasureTest {

	public static void main(String[] args) {
		int userSelect = -1;
		CommandDisplayAll displayAll = new CommandDisplayAll();
		CommandFindMostExpensive findMostExpensive = new CommandFindMostExpensive();
		CommandFindToSetPrice findSetPrice = new CommandFindToSetPrice();
		CommandFindByPrice findByPrice = new CommandFindByPrice();
		ViewMenuProvider viewMenuProvider = new ViewMenuProvider();
		
		do {
			viewMenuProvider.menuPrint();

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			userSelect = scan.nextInt();
			
			switch(userSelect) {
			case 1: {
				displayAll.doAction();
				break;
			}
			case 2: {
				findMostExpensive.doAction();
				break;
			}
			case 3: {
				findSetPrice.doAction();
				break;
			}
			case 4: {
				findByPrice.doAction();
				break;
			}
			}
		}while(userSelect !=0);
		viewMenuProvider.exitMenu();
	}

}
