package by.htp.les09.AgregationAndCompositionTask02;

public class CarLogic {
	

	public void startCarEngine(Car car) {
		
		EngineLogic enLogic = new EngineLogic();
		enLogic.startEngine(car.getEngine());
		System.out.println("Car engine started");
		
	}
	
	public void stopCarEngine(Car car) {
		EngineLogic enLogic = new EngineLogic();
		enLogic.stopEngine(car.getEngine());
		System.out.println("Car engine stopped");
	}
	
	public void replaceTyreFrontRight(Car car, Wheel wheel) {
		car.setFrontRight(wheel);
	}
	public void replaceTyreFrontLeft(Car car, Wheel wheel) {
		car.setFrontLeft(wheel);
	}
	public void replaceTyreRearRight(Car car, Wheel wheel) {
		car.setRightRear(wheel);
	}
	public void replaceTyreRearLeft(Car car, Wheel wheel) {
		car.setLeftRear(wheel);
	}
	
	public void drive(Car car) {
		if (car.getEngine().getEngineStatus() == true) {
			System.out.println("Car is moving forward");
		} else {
			System.out.println("Please start the engine first.");
		}
	}
	
	public void stop(Car car) {
		System.out.println("Car stopped");
	}
	
	public void refuel(Car car) {
		if (car.getEngine().getEngineStatus()== false) {
			System.out.println("Refueling the car. ");
		} else {
			System.out.println("In order to refuel the car, you need to stop the engine first.");
		}
		
	}
	
}
