package singleton;

public class EagerSingleton {
	
	// 자원이 낭비될 수 있다.
	private static EagerSingleton instnace = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstnace() {
		return instnace;
	}
}
