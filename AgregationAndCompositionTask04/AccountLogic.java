package by.htp.les09.AgregationAndCompositionTask04;

import java.util.List;

public class AccountLogic {

	public void blockAccount(Account account) {
		account.setBlocked(true);
	}

	public void unblockAccount(Account account) {
		account.setBlocked(false);
	}

	public double sumAccountsAll(Client client) {
		double sumAccount = 0;
		
		List<Account> accountList;
		
		accountList = client.getAccounts();
		
		for (int i = 0; i < accountList.size(); i++) {
			sumAccount = sumAccount + accountList.get(i).getBalance();

		}
		return sumAccount;
	}
	
	public void findAccount(Client client, long accountNumber) {
		List<Account> accountList;
		accountList = client.getAccounts();
		long accounts;
		
		for(int i = 0; i < accountList.size(); i++) {
			accounts = accountList.get(i).getAccountNumber();
			if(accountNumber == accounts) {
				System.out.println(accountList.get(i));
			}
		}
	}
	
	public double sumOfPositiveAccounts(Client client) {
		List<Account> accountList;
		accountList = client.getAccounts();
		double sum = 0;
		double tempBalance = 0;
		
		for (int i = 0; i < accountList.size(); i++) {
			tempBalance = accountList.get(i).getBalance();
			
			if (tempBalance > 0) {
				sum = sum + tempBalance;
			}
		}
		return sum;
	}
	
	
	public double sumOfNegativeAccounts(Client client) {
		List<Account> accountList;
		accountList = client.getAccounts();
		double sum = 0;
		double tempBalance = 0;
		
		for (int i = 0; i < accountList.size(); i++) {
			tempBalance = accountList.get(i).getBalance();
			
			if (tempBalance < 0) {
				sum = sum + tempBalance;
			}
		}
		return sum;
	}

}
