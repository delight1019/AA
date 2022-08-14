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
    	System.out.println("�� ���̴� ��");
    }

    public void pourInCup(){
    	System.out.println("�ſ� ������ ��");
    }

    public boolean customerWantsCondiments(){
        return true;
    }

    public abstract void addCondiments();

}
