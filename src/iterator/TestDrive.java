package iterator;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
		waitress.printMenu();
	}

}
