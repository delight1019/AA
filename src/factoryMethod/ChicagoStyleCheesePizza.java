package factoryMethod;

public class ChicagoStyleCheesePizza extends factoryMethod.Pizza {

	public ChicagoStyleCheesePizza() {
		name = "��ī�� ��Ÿ�� �� �� ġ�� ����";
		dough = "���� �β��� ũ����Ʈ ����";
		sauce = "�÷��丶�� �ҽ�";
		
		toppings.add("�߰� ������ ��¥���� ġ��");
	}
	
    public void cut(){
    	System.out.println("�׸� ������� ���� �ڸ���");
    }

}
