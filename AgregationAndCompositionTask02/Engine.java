package by.htp.les09.AgregationAndCompositionTask02;

public class Engine {

	private int power;
	private boolean isEngineOn;
	
	
	public Engine (int power) {
		this.power = power;
		this.isEngineOn = false;
	}


	public int getPower() {
		return power;
	}
	
	public boolean getEngineStatus() {
		return isEngineOn;
	}
	
	public boolean startEngine() {
		this.isEngineOn = true;
		return isEngineOn;
	}
	
	public boolean stopEngine() {
		this.isEngineOn = false;
		return isEngineOn;
	}


	@Override
	public String toString() {
		return "Engine Power = " + power + ", is Engine Started = " + isEngineOn;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isEngineOn ? 1231 : 1237);
		result = prime * result + power;
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
		Engine other = (Engine) obj;
		if (isEngineOn != other.isEngineOn)
			return false;
		if (power != other.power)
			return false;
		return true;
	}
	
	

	
	
	
}
