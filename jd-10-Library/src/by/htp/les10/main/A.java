package by.htp.les10.main;

public class A {
	//singleton потокобезопасный. Часто применяемый синглтон
	private static final A instance = new A();
	
	private int x;
	
	private A() {}
	
	public static A getInstance() {
		return instance;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
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
		A other = (A) obj;
		if (x != other.x)
			return false;
		return true;
	}
	
	
}
