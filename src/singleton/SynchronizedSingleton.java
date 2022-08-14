package singleton;

public class SynchronizedSingleton {
	private static SynchronizedSingleton instance;

	private SynchronizedSingleton() {
		
	}
	
	// ����ȭ�� ���� ������尡 �ִ�.
	public static synchronized SynchronizedSingleton getInstnace() {
		if (instance == null) {
			instance = new SynchronizedSingleton();
		}
		
		return instance;
	}
}
