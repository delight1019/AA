package decorator;

public class DarkRoast extends decorator.Beverage {

	public DarkRoast() {
		description = "Dark roast";
	}
	
    public double cost(){
    	return .99;
    }

}
