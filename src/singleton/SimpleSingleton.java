package singleton;

public class SimpleSingleton {
	private static SimpleSingleton instance;
	
	private SimpleSingleton() {
		
	}
	
	// Multi Thread인 상황일 경우 문제가 있다.
	public static SimpleSingleton getInstance() {
		if (instance == null) {
			instance = new SimpleSingleton();
		}
		
		return instance;
	}

}
