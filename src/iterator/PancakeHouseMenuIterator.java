package iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements iterator.Iterator {
	List<MenuItem> menuItems;
	private int cur = 0;
	
	public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (cur >= menuItems.size()) {
			return false;
		}
		
		return true;
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		MenuItem curItem = menuItems.get(cur);
		cur++;
		return curItem;
	}

}
