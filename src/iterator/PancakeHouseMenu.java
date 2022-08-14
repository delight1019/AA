package iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements iterator.Menu {
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
		// TODO Auto-generated constructor stub
    	
    	menuItems = new ArrayList<MenuItem>();
    	
    	addItem("K&B ������ũ ��Ʈ", "��ũ���� ���׿� �佺Ʈ�� ��鿩�� ������ũ", true, 2.99);
    	addItem("���ַ� ������ũ ��Ʈ", "�ް� �����̿� �ҽ����� ��鿩�� ������ũ", false, 2.99);
    	addItem("��纣�� ������ũ", "�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ", true, 3.49);
    	addItem("����", "���⿡ ���� ��纣���� ���⸦ ���� �� �ִ� ����", true, 3.59);
	}
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
    	MenuItem menuItem = new MenuItem(name, price, description, vegetarian);
    	menuItems.add(menuItem);
    }
    
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new PancakeHouseMenuIterator(menuItems);
	}

}
