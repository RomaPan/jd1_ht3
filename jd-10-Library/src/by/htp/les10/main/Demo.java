package by.htp.les10.main;

public class Demo {

	public static void main(String[] args) {
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		
		a1.setX(3);
		System.out.println(a2.getX());
	}

}
