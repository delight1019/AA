package composite;

public class MenuComponent {
    protected String name;
    protected String description;
    protected double price;
    protected boolean vegetarian;    
    
    public void print(){
    	throw new UnsupportedOperationException();
    }

    public void add(composite.MenuComponent menuComponent){
    	throw new UnsupportedOperationException();
    }

    public void remove(composite.MenuComponent menuComponent){
    	throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int value){
    	throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

}
