package by.htp.les09.AgregationAndCompositionTask04;

public class BankTest {

	public static void main (String[] args) {
		
		Account account1 = new Account(2345_4567_3456_2311L, 100.00d, false);
		Account account2 = new Account(6767_3454_2333_1111L, 100.00d, false);
		Account account3 = new Account(1111_4567_4532_5656L, 100.00d, true);
		Account account4 = new Account(7878_6767_3456_2322L, -100.00d, true);
		Account account5 = new Account(2345_4677_3346_2334L, -100.00d, false);
		Account account6 = new Account(7845_7867_3478_2378L, 100.00d, true);
		
		
		Client client1 = new Client("Siptik Ragdolov");
		AccountLogic acLogic = new AccountLogic();
		
		ClientLogic clLogic = new ClientLogic();
		clLogic.addAccount(client1, account1);
		clLogic.addAccount(client1, account2);
		clLogic.addAccount(client1, account3);
		clLogic.addAccount(client1, account4);
		clLogic.addAccount(client1, account5);
		clLogic.addAccount(client1, account6);
		
		
		System.out.println(client1);

		System.out.println("Sum of all accounts = "+acLogic.sumAccountsAll(client1));
	}
}
