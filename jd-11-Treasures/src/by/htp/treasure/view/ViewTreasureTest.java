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
		
		do {
			System.out.println("                                  /   \\");
			System.out.println(" _                        )      ((   ))     (");
			System.out.println("(@)                      /|\\      ))_((     /|\\");
			System.out.println("|-|                     / | \\    (/\\|/\\)   / | \\                      (@)");
			System.out.println("| | -------------------/--|-voV---\\`|'/--Vov-|--\\---------------------|-|");
			System.out.println("|-|                         '^`   (o o)  '^`                          | |");
			System.out.println("| |                               `\\Y/'                               |-|");
			System.out.println("|-|          Welcome to Dragon's lair, please make your choice:       | |");
			System.out.println("| |          => 1 - view all treasures located inside                 |-|");
			System.out.println("|-|          => 2 - find the most expensive treasure                  | |");
			System.out.println("| |          => 3 - find what you can buy for the set amount          |-|");
			System.out.println("|-|          => 4 - look up treasures by price                        | |");
			System.out.println("| |          => 0 - to quit                                           |-|");
			System.out.println("|_|___________________________________________________________________| |");
			System.out.println("(@)              l   /\\ /         ( (       \\ /\\   l                `\\|-|");
			System.out.println("                 l /   V           \\ \\       V   \\ l                  (@)");
			System.out.println("                 l/                _) )_          \\I");
			System.out.println("                                   `\\ /'");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("\t\tYour choice, wanderer: ");
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
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("”Think you've seen it all? Think again. Outside those doors,\n"
				+ "we might see anything. We could find new worlds, terrifying monsters,\n"
				+ "impossible things. And if you come with me... nothing will ever be the\n"
				+ "same again!” - 10th Dr Who - David Tennant");
		System.out.println("     _.------._");
		System.out.println(" _.-'          '-._");
		System.out.println("/                  \\");
		System.out.println("'------------------'");
		System.out.println("| .--------------. |");
		System.out.println("| |      ||      | |");
		System.out.println("|[]      ||      | |");
		System.out.println("| |======||======| |");
		System.out.println("| |      ||      | |");
		System.out.println("| |      ||      | |");
		System.out.println("|[]======||======[ |");
		System.out.println("| |======||======| |");
		System.out.println("| |      ||      | |");
		System.out.println("| |      ||      | |");
		System.out.println("|[]======||======| |");
		System.out.println("| |      ||      | |");
		System.out.println("| '------''------' |");
		System.out.println("|__________________|");

	}

}
