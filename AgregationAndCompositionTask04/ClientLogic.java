package by.htp.les09.AgregationAndCompositionTask04;



public class ClientLogic {
	
	
	public void addAccount(Client client, Account account) {
		client.getAccounts().add(account);
		
	}
	
	public void deleteAccount(Client client, Account account) {
		client.getAccounts().remove(account);
	}
	
	public void addAccount(Client client) {
		
	}
}
