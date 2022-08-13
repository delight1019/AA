package abstractFactory;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Clam clam;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("���� ��..");
	}
	
	public void cut() {
		System.out.println("�ڸ��� ��..");
		
	}
	public void box() {
		System.out.println("�����ϴ� ��...");
	}
}
