package by.htp.treasure.controller;

import by.htp.treasure.dao.impl.FileTreasureDAO;

public class Controller {
	FileTreasureDAO treasures = new FileTreasureDAO();
	
	public void displayAll() {
		treasures.viewAllTreasures();
	}

	public void findMostExpensive () {
		treasures.findMostExpensiveTrease();
	}
	
	public void findSetPrice() {
		treasures.findTreasuresToSetPrice();
	}
	
	public void findByPrice() {
		treasures.findTreasureByPrice();
	}
}
