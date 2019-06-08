package by.htp.les09.AgregationAndCompositionTask04;

import java.util.ArrayList;

public class Client {

	private String nameSurename;
	private ArrayList<Account> accounts;
	
	
	public Client (String nameSurename) {
		this.nameSurename = nameSurename;
		this.accounts = new ArrayList<Account>();
	}


	public String getNameSurename() {
		return nameSurename;
	}


	public void setNameSurename(String nameSurename) {
		this.nameSurename = nameSurename;
	}


	public ArrayList<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((nameSurename == null) ? 0 : nameSurename.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (nameSurename == null) {
			if (other.nameSurename != null)
				return false;
		} else if (!nameSurename.equals(other.nameSurename))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Client " + nameSurename + "\n" + accounts;
	}
	
//	public void addAccount(Account account) {
//		this.accounts.add(account);
//	}
//	
//	public void deleteAccount(Account account) {
//		this.accounts.remove(account);
//	}
	
	
	
	
	
}
