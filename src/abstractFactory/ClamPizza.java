package abstractFactory;

public class ClamPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		// TODO Auto-generated constructor stub
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.clam = ingredientFactory.createClam();
	}

}
