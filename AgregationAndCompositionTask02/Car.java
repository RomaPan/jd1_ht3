package by.htp.les09.AgregationAndCompositionTask02;

public class Car {

	private Wheel frontRight;
	private Wheel frontLeft;
	private Wheel rightRear;
	private Wheel leftRear;
	private Engine engine;
	private String modelName;
	
	
	public Car (Engine engine, Wheel frontRight, Wheel frontLeft, Wheel leftRear, Wheel rightRear, String modelName) {
		this.engine = engine;
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rightRear = rightRear;
		this.leftRear = leftRear;
		this.modelName = modelName;
	}


	public Wheel getFrontRight() {
		return frontRight;
	}


	public void setFrontRight(Wheel frontRight) {
		this.frontRight = frontRight;
	}


	public Wheel getFrontLeft() {
		return frontLeft;
	}


	public void setFrontLeft(Wheel frontLeft) {
		this.frontLeft = frontLeft;
	}


	public Wheel getRightRear() {
		return rightRear;
	}


	public void setRightRear(Wheel rightRear) {
		this.rightRear = rightRear;
	}


	public Wheel getLeftRear() {
		return leftRear;
	}


	public void setLeftRear(Wheel leftRear) {
		this.leftRear = leftRear;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((frontLeft == null) ? 0 : frontLeft.hashCode());
		result = prime * result + ((frontRight == null) ? 0 : frontRight.hashCode());
		result = prime * result + ((leftRear == null) ? 0 : leftRear.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + ((rightRear == null) ? 0 : rightRear.hashCode());
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
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (frontLeft == null) {
			if (other.frontLeft != null)
				return false;
		} else if (!frontLeft.equals(other.frontLeft))
			return false;
		if (frontRight == null) {
			if (other.frontRight != null)
				return false;
		} else if (!frontRight.equals(other.frontRight))
			return false;
		if (leftRear == null) {
			if (other.leftRear != null)
				return false;
		} else if (!leftRear.equals(other.leftRear))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (rightRear == null) {
			if (other.rightRear != null)
				return false;
		} else if (!rightRear.equals(other.rightRear))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Car [Front Right Wheel = " + frontRight + "\n     Front Left Wheel = " + frontLeft + "\n     Right Rear Wheel = " + rightRear + "\n     Left Rear Wheel = "
				+ leftRear + "\n"+"     Engine = " + engine +"\n"+"     Car Model Name = " + modelName + "]";
	}
	
	
}
