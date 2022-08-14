package singleton;

public class SimpleSingleton {
	private static SimpleSingleton instance;
	
	private SimpleSingleton() {
		
	}
	
	// Multi Thread�� ��Ȳ�� ��� ������ �ִ�.
	public static SimpleSingleton getInstance() {
		if (instance == null) {
			instance = new SimpleSingleton();
		}
		
		return instance;
	}

}
