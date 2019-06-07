package by.htp.les09.AgregationAndCompositionTask02;

public class EngineLogic {
	private boolean isEngineOn;
	
	public EngineLogic() {
		
	}
	
	public boolean startEngine (Engine engine) {
		this.isEngineOn = engine.startEngine();
		return isEngineOn;
	}
	
	public boolean stopEngine (Engine engine) {
		this.isEngineOn = engine.stopEngine();
		return isEngineOn;
	}
}
