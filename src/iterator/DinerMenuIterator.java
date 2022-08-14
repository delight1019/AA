package iterator;

public class DinerMenuIterator implements iterator.Iterator {
	MenuItem[] menuItems;
	private int cur = 0;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if ((cur >= menuItems.length) || (menuItems[cur] == null)) {
			return false;
		}
		
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem curItem = menuItems[cur];
		cur++;
		
		return curItem;
	}

}
