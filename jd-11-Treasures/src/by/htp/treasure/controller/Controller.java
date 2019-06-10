package by.htp.treasure.controller;

import java.util.Scanner;

import by.htp.treasure.dao.impl.FileTreasureDAO;

public class Controller {
	FileTreasureDAO treasures = new FileTreasureDAO();
	
	public void displayAll() {
		System.out.println("-----------------------------------------------------------------------");
		treasures.viewAllTreasures();
		System.out.println("-----------------------------------------------------------------------");
	}

	public void findMostExpensive () {
		System.out.println("-----------------------------------------------------------------------");
		treasures.findMostExpensiveTrease();
		System.out.println("-----------------------------------------------------------------------");
	}
	
	
	public void findSetPrice() {
		int userSum;
		System.out.print("Please enter the sum of gold you have: ");
		@SuppressWarnings("resource")
		Scanner scanUser = new Scanner(System.in);
		userSum = scanUser.nextInt();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("\nSet of treasures adds to that amount:\n");
		treasures.findTreasuresToSetPrice(userSum);
		System.out.println("-----------------------------------------------------------------------");
	}
	
	public void findByPrice() {
		int userPrice;
		System.out.print("Please enter price here: ");
		@SuppressWarnings("resource")
		Scanner scanUser = new Scanner(System.in);
		userPrice = scanUser.nextInt();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("\nList of items matching your price found:\n");
		treasures.findTreasureByPrice(userPrice);
		System.out.println("-----------------------------------------------------------------------");
	}
}
