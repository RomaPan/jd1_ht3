package by.htp.les09.AgregationAndCompositionTask03;

public class County {
	private String countyName;
	private int countyArea;
	private boolean isCapitalNationalCapital;
	
	
	public County(Town countyCapitol, int countyArea) {
		if (countyCapitol.isCountyCapital()==true) {
			this.countyName = countyCapitol.getName();
		} else {
			this.countyName = null;
		}
		this.countyArea = countyArea;
		this.isCapitalNationalCapital = countyCapitol.isNationCapital();
	}
	
	

	public boolean isCapitolNationalCapitol() {
		return isCapitalNationalCapital;
	}



	public void setCapitolNationalCapitol(boolean isCapitolNationalCapitol) {
		this.isCapitalNationalCapital = isCapitolNationalCapitol;
	}



	public String getCountyName() {
		return countyName;
	}


	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}


	public int getCountyArea() {
		return countyArea;
	}


	public void setCountyArea(int countyArea) {
		this.countyArea = countyArea;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countyArea;
		result = prime * result + ((countyName == null) ? 0 : countyName.hashCode());
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
		County other = (County) obj;
		if (countyArea != other.countyArea)
			return false;
		if (countyName == null) {
			if (other.countyName != null)
				return false;
		} else if (!countyName.equals(other.countyName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "County [countyName=" + countyName + ", countyArea=" + countyArea + "]";
	}
	
	

}
