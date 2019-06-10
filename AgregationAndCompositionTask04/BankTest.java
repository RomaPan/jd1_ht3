package by.htp.les09.AgregationAndCompositionTask04;

public class BankTest {

	public static void main (String[] args) {
		
		Account account1 = new Account(2345_4567_3456_2311L, 100.00d, false);
		Account account2 = new Account(6767_3454_2333_1111L, 100.00d, false);
		Account account3 = new Account(1111_4567_4532_5656L, -100.00d, true);
		Account account4 = new Account(7878_6767_3456_2322L, -100.00d, true);
		Account account5 = new Account(2345_4677_3346_2334L,  100.00d, false);
		Account account6 = new Account(7845_7867_3478_2378L, 100.00d, true);
		
		
		Client client1 = new Client("Sipsik Ragdollov");
		
		client1.add(account1);
		client1.add(account2);
		client1.add(account3);
		client1.add(account4);
		client1.add(account5);
		client1.add(account6);
		
		AccountLogic acLogic = new AccountLogic();
		
		//overall sum of all accounts
		double sum = acLogic.sumAccountsAll(client1);
		System.out.println(client1);
		System.out.println(sum);
		
		//Block account
		acLogic.blockAccount(account1);
		System.out.println(account1);
		//Unblock account
		acLogic.unblockAccount(account1);
		System.out.println(account1);
		
		
		//search by account number
		acLogic.findAccount(client1, 7878676734562322L);
		
		//sum of all positive balance accounts
		double sum2 = acLogic.sumOfPositiveAccounts(client1);
		System.out.println(sum2);
		
		
		//sum of all negative balance accounts
		double sum3 = acLogic.sumOfNegativeAccounts(client1);
		System.out.println(sum3);
		
		
	}
}
