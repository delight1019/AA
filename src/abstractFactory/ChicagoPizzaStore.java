package abstractFactory;

public class ChicagoPizzaStore {

	public Pizza createPizza(String type){
        if (type.equals("clam")) {
        	return new ClamPizza(new ChicagoPizzaIngredientFactory());
        }
        else if (type.equals("cheese")) {
        	return new CheesePizza(new ChicagoPizzaIngredientFactory());
        }
        else {
        	return null;
        }
    }
}
