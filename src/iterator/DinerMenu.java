package iterator;

public class DinerMenu implements iterator.Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
		// TODO Auto-generated constructor stub
    	
    	menuItems = new MenuItem[MAX_ITEMS];
    	
    	addItem("ä�������ڿ� BLT", "��� ���� ���� ������, ����, �丶�並 ���� �޴�", true, 2.99);
    	addItem("BLT", "��� ���� ������, ����, �丶�並 ���� �޴�", false, 2.99);
    	addItem("������ ����", "���� �����带 ����� ������ ����", false, 3.29);
    	addItem("�ֵ���", "���ũ���Ʈ, ���� ���, ����, ġ� ��鿩�� �ֵ���", false, 3.05);
	}
    
    public void addItem( String name, String description, boolean vegetarian, double price) {
    	MenuItem menuItem = new MenuItem(name, price, description, vegetarian);
    	
    	if (numberOfItems >= MAX_ITEMS) {
    		System.out.println("�˼��մϴ�, �޴��� �� á���ϴ�. �� �̻� �߰��� �� �����ϴ�.");
    		return;
    	}
    	
    	menuItems[numberOfItems] = menuItem;
    	numberOfItems++;
    }
    
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new DinerMenuIterator(menuItems);
	}

}
