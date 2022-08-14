package templateMethod;

public abstract class CaffeinBeverage {

    public void prepareRecipe(){
    	boilWater();
    	brew();
    	pourInCup();
    	
    	if (customerWantsCondiments()) {
    		addCondiments();
    	}
    }

    public abstract void brew();

    public void boilWater(){
    	System.out.println("물 끓이는 중");
    }

    public void pourInCup(){
    	System.out.println("컵에 따르는 중");
    }

    public boolean customerWantsCondiments(){
        return true;
    }

    public abstract void addCondiments();

}
