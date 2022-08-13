package decorator;

public abstract class CondimentDecorator extends decorator.Beverage {
    protected Beverage beverage;

    public String getDescription(){
    	return description;
    }
}
