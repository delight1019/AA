package decorator;

public class HouseBlend extends decorator.Beverage {

	public HouseBlend() {
		description = "House blend coffee";
	}
	
    public double cost(){
    	return .89;
    }

}
