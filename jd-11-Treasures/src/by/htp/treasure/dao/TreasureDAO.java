package by.htp.treasure.dao;

public interface TreasureDAO {
	
	void viewAllTreasures();
	void findMostExpensiveTrease();
	void findTreasuresToSetPrice(int setPrice);
	void findTreasureByPrice(int price);

}
