package singleton;

public class DoubleCheckLockingSingleton {
	private volatile static DoubleCheckLockingSingleton instance;
	
	private DoubleCheckLockingSingleton() {
		
	}
	
	public static DoubleCheckLockingSingleton getInstnace() {
		if (instance == null) {
			synchronized (DoubleCheckLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		
		return instance;
	}
}
