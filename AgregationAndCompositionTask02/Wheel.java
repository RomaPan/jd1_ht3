package by.htp.les09.AgregationAndCompositionTask02;

public class Wheel {
	private int pressure;
	private boolean isFlat;
	
	
	public Wheel (int pressure) {
		this.pressure = pressure;
		this.isFlat = false;
	}


	public boolean isFlat() {
		return isFlat;
	}


	public void setFlat(boolean isFlat) {
		this.isFlat = isFlat;
	}


	public int getPressure() {
		return pressure;
	}
	
	public boolean getIsFlat() {
		return isFlat;
	}


	@Override
	public String toString() {
		return "Tyre pressure: "+ pressure + ", Flat tyre: " + isFlat;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isFlat ? 1231 : 1237);
		result = prime * result + pressure;
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
		Wheel other = (Wheel) obj;
		if (isFlat != other.isFlat)
			return false;
		if (pressure != other.pressure)
			return false;
		return true;
	}
	
	
}
