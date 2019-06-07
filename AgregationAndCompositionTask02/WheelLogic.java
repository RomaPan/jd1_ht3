package by.htp.les09.AgregationAndCompositionTask02;

public class WheelLogic {
	private int pressure;
	private boolean isFlat;
	
	
	public void pumpWheel(Wheel wheel) {
		pressure = wheel.getPressure();
		isFlat = wheel.getIsFlat();
		
		if (pressure == 0 || isFlat == true) {
			System.out.println("The tyre is flat, maintenance required.");
		}
	}
}
