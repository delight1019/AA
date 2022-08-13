package decorator;

public class Mocha extends decorator.CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
    public String getDescription(){
    	return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
    	return .20 + beverage.cost();
    }

}
