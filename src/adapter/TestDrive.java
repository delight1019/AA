package adapter;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallardDuck = new MallardDuck();
		Turkey wildTurkey = new WildTurkey();
		
		simultateDuck(mallardDuck);
		simultateDuck(new TurkeyAdapter(wildTurkey));
	}

	private static void simultateDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
