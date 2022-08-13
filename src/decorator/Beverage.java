package decorator;

public abstract class Beverage {
    protected String description = "제목 없음";

    public String getDescription(){
    	return description;
    }
    
    public String toString() {
    	return getDescription() + " $" + cost();
    }

    public abstract double cost();
}
