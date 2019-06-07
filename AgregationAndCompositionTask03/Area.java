package by.htp.les09.AgregationAndCompositionTask03;

public class Area extends Town {
	private String townAreaName;
	private int townArea;
	
	
	public Area (Town town, int townArea) {
		this.townAreaName = town.getName();
		this.townArea = townArea;
	}


	public String getTownAreaName() {
		return townAreaName;
	}


	public void setTownAreaName(String townAreaName) {
		this.townAreaName = townAreaName;
	}


	public int getTownArea() {
		return townArea;
	}


	public void setTownArea(int townArea) {
		this.townArea = townArea;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + townArea;
		result = prime * result + ((townAreaName == null) ? 0 : townAreaName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area other = (Area) obj;
		if (townArea != other.townArea)
			return false;
		if (townAreaName == null) {
			if (other.townAreaName != null)
				return false;
		} else if (!townAreaName.equals(other.townAreaName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Area [townAreaName=" + townAreaName + ", townArea=" + townArea + "]";
	}
	
	
}
