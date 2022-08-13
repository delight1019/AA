package abstractFactory;

public class NYPizzaStore {

    public Pizza createPizza(String type){
        if (type.equals("clam")) {
        	return new ClamPizza(new NYPizzaIngredientFactory());
        }
        else if (type.equals("cheese")) {
        	return new CheesePizza(new NYPizzaIngredientFactory());
        }
        else {
        	return null;
        }
    }

}
