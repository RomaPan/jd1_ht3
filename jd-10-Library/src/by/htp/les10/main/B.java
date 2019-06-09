package by.htp.les10.main;

public class B {
	//singleton не потокобезопасный
//	В многопоточном коде такой шаблон использовать нельзя
	private static B instance = null;
	
	private B() {}

	public static B getInstance() {
		if (instance == null) {
			instance = new B();
		}
		return instance;
	}
}
