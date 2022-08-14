package iterator;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

    public void printMenu(){
    	Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    	Iterator dinerIterator = dinerMenu.createIterator();
    	
    	System.out.println("�޴�");
    	System.out.println("---");
    	
    	System.out.println("��ħ �޴�");
    	printMenu(pancakeIterator);
    	
    	System.out.println();
    	System.out.println("���� �޴�");
    	printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
    	while (iterator.hasNext()) {
    		MenuItem menuItem = iterator.next();
    		System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
    	}
    }
}
