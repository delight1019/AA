package iterator;

public class MenuItem {
	private String name;
	private double price;
	private String description;
	private boolean vegetarian;

	public MenuItem(String name, double price, String description, boolean vegetarian) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.description = description;
		this.vegetarian = vegetarian;
	}
	
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public boolean getVegetarian() {
    	return vegetarian;
    }
}
