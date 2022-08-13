package decorator;

public abstract class Beverage {
    protected String description = "���� ����";

    public String getDescription(){
    	return description;
    }
    
    public String toString() {
    	return getDescription() + " $" + cost();
    }

    public abstract double cost();
}
