package abstractFactory;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Clam clam;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("굽는 중..");
	}
	
	public void cut() {
		System.out.println("자르는 중..");
		
	}
	public void box() {
		System.out.println("포장하는 중...");
	}
}
