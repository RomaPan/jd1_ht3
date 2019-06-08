package by.htp.les09.AgregationAndCompositionTask04;

public class AccountLogic {
	private double sumAccounts;

	
	public void blockAccount(Account account) {
		
		account.setBlocked(true);
		
		
	}
	
	public void unblockAccount(Account account) {
		
		account.setBlocked(false);
	}
	
	public double sumAccountsAll(Client client) {
		for (int i = 0; i < client.getAccounts().size(); i++) {
			this.sumAccounts = this.sumAccounts + client.getAccounts().get(i).getBalance();
			
		}
		return this.sumAccounts;
	}

}
