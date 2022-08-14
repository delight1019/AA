package templateMethod;

public class Tea extends templateMethod.CaffeinBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("찻잎을 우려내는 중");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("레몬을 추가하는 중");
	}

}
