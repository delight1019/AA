package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends composite.MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    
    public Menu(String name, String description) {
		// TODO Auto-generated constructor stub
    	this.name = name;
    	this.description = description;
	}
    
    @Override
    public void add(MenuComponent menuComponent) {
    	// TODO Auto-generated method stub
    	menuComponents.add(menuComponent);
    }
    
    @Override
    public void remove(MenuComponent menuComponent) {
    	// TODO Auto-generated method stub
    	menuComponents.remove(menuComponent);
    }
    
    @Override
    public MenuComponent getChild(int value) {
    	// TODO Auto-generated method stub
    	return menuComponents.get(value);
    }
    
    @Override
    public String getName() {
    	// TODO Auto-generated method stub
    	return name;
    }
    
    @Override
    public String getDescription() {
    	// TODO Auto-generated method stub
    	return description;
    }
    
    @Override
    public void print() {
    	// TODO Auto-generated method stub
    	System.out.print("\n" + getName());
    	System.out.println(", " + getDescription());
    	System.out.println("----------------------");
    	
    	for (MenuComponent menuComponent : menuComponents) {
    		menuComponent.print();
    	}
    }
}
