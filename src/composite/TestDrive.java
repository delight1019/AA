package composite;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuComponent pancakeHouseMenu = new Menu("������ũ �Ͽ콺 �޴�", "��ħ �޴�");
		MenuComponent dinerMenu = new Menu("��ü���� �Ĵ� �޴�", "���� �޴�");
		MenuComponent cafeMenu = new Menu("ī�� �޴�", "���� �޴�");
		MenuComponent dessertMenu = new Menu("����Ʈ �޴�", "����Ʈ�� ��� ������");
		
		MenuComponent allMenus = new Menu("��ü �޴�", "��ü �޴�");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		pancakeHouseMenu.add(new MenuItem("K&B ������ũ ��Ʈ", "��ũ���� ���׿� �佺Ʈ�� ��鿩�� ������ũ", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("���ַ� ������ũ ��Ʈ", "�ް� �����̿� �ҽ����� ��鿩�� ������ũ", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("��纣�� ������ũ", "�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("����", "���⿡ ���� ��纣���� ���⸦ ���� �� �ִ� ����", true, 3.59));
		
		dinerMenu.add(new MenuItem("ä�������ڿ� BLT", "��� ���� ���� ������, ����, �丶�並 ���� �޴�", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "��� ���� ������, ����, �丶�並 ���� �޴�", false, 2.99));
		dinerMenu.add(new MenuItem("������ ����", "���� �����带 ����� ������ ����", false, 3.29));
		dinerMenu.add(new MenuItem("�ֵ���", "���ũ���Ʈ, ���� ���, ����, ġ� ��鿩�� �ֵ���", false, 3.05));
		dinerMenu.add(new MenuItem("�Ľ�Ÿ", "�������� �ҽ� ���İ�Ƽ, ȿ�𻧵� �帳�ϴ�.", true, 3.89));
		
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("���� ����", "�ٻ�ٻ��� ũ����Ʈ�� �ٴҶ� ���̽�ũ���� ���� �ִ� ���� ����", true, 1.59));
		dessertMenu.add(new MenuItem("ġ������ũ", "���ݸ� �׷��̾� ũ����Ʈ ���� �ε巯�� ���� ġ������ũ", true, 1.99));
		dessertMenu.add(new MenuItem("�Ҹ���", "������� ������ ������ ��ȭ", true, 1.89));
		
		cafeMenu.add(new MenuItem("���� ���ſ� ���� ������", "��л�, ���� ,�丶��, ���� Ƣ���� ÷���� ���� ����", true, 3.99));
		cafeMenu.add(new MenuItem("������ ����", "�����尡 ��鿩�� ������ ����", false, 3.69));
		cafeMenu.add(new MenuItem("�θ���", "�� ������� ���, ����ī���� ��鿩�� Ǫ���� �θ���", true, 4.29));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}
