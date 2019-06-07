package by.htp.les09.AgregationAndCompositionTask02;

public class Test {

	public static void main(String[] args) {
		
		Wheel wheel1 = new Wheel(1);
		Wheel wheel2 = new Wheel(1);
		Wheel wheel3 = new Wheel(1);
		Wheel wheel4 = new Wheel(1);
		
		Engine engine = new Engine (60);
		
		Car car1 = new Car(engine, wheel1, wheel2, wheel3, wheel4, "Geely");
		System.out.println(car1);
		
		CarLogic crLogic = new CarLogic();
		
		crLogic.startCarEngine(car1);
		System.out.println(car1);
		
		crLogic.stopCarEngine(car1);
		System.out.println(car1);
		
		crLogic.drive(car1);
		crLogic.refuel(car1);
		
		crLogic.startCarEngine(car1);
		crLogic.drive(car1);
		crLogic.stop(car1);
		
		Wheel wheel5 = new Wheel (2);
		crLogic.replaceTyreFrontRight(car1, wheel5);
		System.out.println(car1);

	}

}
