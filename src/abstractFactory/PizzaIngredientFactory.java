package abstractFactory;

public interface PizzaIngredientFactory {

    public abstractFactory.Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Clam createClam();

}
