package singleton;

public class EagerSingleton {
	
	// �ڿ��� ����� �� �ִ�.
	private static EagerSingleton instnace = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstnace() {
		return instnace;
	}
}
