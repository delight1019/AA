package adapter;

public class MallardDuck implements adapter.Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("꽥!");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날고 있어요!");
	}

}
