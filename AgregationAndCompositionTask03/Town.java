package by.htp.les09.AgregationAndCompositionTask03;

public class Town {

	private String name;
	private boolean isCountyCapital;
	private boolean isNationCapital;
	
	
	public Town () {
		
	}
	
	public Town (String name, boolean isCountyCapitol, boolean isNationCapitol) {
		this.name = name;
		this.isCountyCapital = isCountyCapitol;
		this.isNationCapital = isNationCapitol;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCountyCapital() {
		return isCountyCapital;
	}

	public void setCountyCapital(boolean isCountyCapital) {
		this.isCountyCapital = isCountyCapital;
	}

	public boolean isNationCapital() {
		return isNationCapital;
	}

	public void setNationCapital(boolean isNationCapital) {
		this.isNationCapital = isNationCapital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isCountyCapital ? 1231 : 1237);
		result = prime * result + (isNationCapital ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Town other = (Town) obj;
		if (isCountyCapital != other.isCountyCapital)
			return false;
		if (isNationCapital != other.isNationCapital)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Town [name=" + name + ", isCountyCapital=" + isCountyCapital + ", isNationCapital=" + isNationCapital
				+ "]";
	}
	
	
}
