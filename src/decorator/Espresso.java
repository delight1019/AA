package decorator;

public class Espresso extends decorator.Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
    public double cost(){
    	return 1.00;
    }

}
