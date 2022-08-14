package singleton;

public class SynchronizedSingleton {
	private static SynchronizedSingleton instance;

	private SynchronizedSingleton() {
		
	}
	
	// 동기화로 인한 오버헤드가 있다.
	public static synchronized SynchronizedSingleton getInstnace() {
		if (instance == null) {
			instance = new SynchronizedSingleton();
		}
		
		return instance;
	}
}
