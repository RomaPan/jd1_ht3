package by.htp.treasure.dao.impl;

import java.io.File;
import java.util.Scanner;

import by.htp.treasure.dao.TreasureDAO;

public class FileTreasureDAO implements TreasureDAO{

	private Scanner scan;
	
	
	
	@Override
	public void viewAllTreasures() {
		try {
			scan = new Scanner(new File("resources/treasures.txt"));
			System.out.println("\n-----------------------------------------------------------------------");
			System.out.println("List of all treasures found in Dragon's lair:");
			System.out.println("\n-----------------------------------------------------------------------");
			while(scan.hasNext()) {
				String a = scan.next();
				String b = scan.next();
				System.out.printf("%-30s %s\n", a,b);
			}
		}catch (Exception e) {
			System.out.println("could not find the file");
		}
	}

	
	@Override
	public void findMostExpensiveTrease() {
		int maxPrice = 0;
		String treasureName="";
		try {
			scan = new Scanner(new File("resources/treasures.txt"));
			System.out.println("\n-----------------------------------------------------------------------");
			System.out.println("\nMost expensive item found in Dragon's lair:\n");
			while(scan.hasNext()) {
				String a = scan.next();
				int b = scan.nextInt();
					if (b > maxPrice) {
						treasureName = a;
						maxPrice = b; 
					}
			}	
		}catch (Exception e) {
			System.out.println("could not find the file");
		}
		System.out.printf("%-30s %s\n", treasureName,maxPrice+"\n");
	}

	
	@SuppressWarnings("resource")
	@Override
	public void findTreasuresToSetPrice() {
		int userSum;
		int treasureSum = 0;
		Scanner scanUser = new Scanner(System.in);
		System.out.print("Please enter the sum of gold you have: ");
		userSum = scanUser.nextInt();
		try {
			scan = new Scanner(new File("resources/treasures.txt"));
			System.out.println("\nItems found in Dragon's lair:\n");
			
			while(scan.hasNext() && treasureSum < userSum) {
				String a = scan.next();
				int b = scan.nextInt();
					if (treasureSum + b < userSum) {
						System.out.printf("%-30s %s\n", a,b);
						treasureSum = treasureSum + b;
					} else {
						continue;
					}
			}	
		}catch (Exception e) {
			System.out.println("could not find the file");
		}
	}
	
	@SuppressWarnings("resource")
	@Override
	public void findTreasureByPrice() {
		int userPrice;
		int counter = 0;
		
		Scanner scanUser = new Scanner(System.in);
		System.out.print("Please enter price here: ");
		userPrice = scanUser.nextInt();
		try {
			scan = new Scanner(new File("resources/treasures.txt"));
			System.out.println("\nList of items matching your price found:\n");
			
			while(scan.hasNext()) {
				String a = scan.next();
				int b = scan.nextInt();
					if (b == userPrice) {
						System.out.printf("%-30s %s\n", a,b);
						counter++;
					} else {
						continue;
					}
			}
			if ( counter == 0 ) {
				System.out.println("Unfortunatly no items found matching that price, please try again.");
			}
		}catch (Exception e) {
			System.out.println("could not find the file");
		}
	}
}