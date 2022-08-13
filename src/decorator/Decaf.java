package decorator;

public class Decaf extends decorator.Beverage {

	public Decaf() {
		description = "Decaf. coffee";
	}
	
    public double cost(){
    	return 1.05;
    }

}
