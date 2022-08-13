package factoryMethod;

public abstract class PizzaStore {

    public abstract factoryMethod.Pizza createPizza(String type);

    public factoryMethod.Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

}
