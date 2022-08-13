package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<String>();

    public void prepare(){
    	System.out.println("�غ� �� : " + name);
    	System.out.println("���츦 ������ ��...");
    	System.out.println("�ҽ��� �Ѹ��� ��...");
    	System.out.println("������ �ø��� ��...");
    	
    	for (String topping : toppings) {
    		System.out.println(" " + topping);
    	}
    }

    public void bake(){
    	System.out.println("175������ 25�� �� ����");
    }

    public void cut(){
    	System.out.println("���ڸ� �缱���� �ڸ���");
    }

    public void box(){
    	System.out.println("���ڿ� ���� ���");
    }

    public String getName(){
        return name;
    }

}
