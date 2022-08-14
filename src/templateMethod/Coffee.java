package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends templateMethod.CaffeinBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("���ͷ� Ŀ�Ǹ� ������� ��");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ �߰��ϴ� ��");
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		
		System.out.print("Ŀ�ǿ� ������ ������ �������? (y/n)?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		}
		catch (IOException ioe) {
			System.err.println("IO ����");
		}
		
		if (answer == null) {
			return "no";
		}
		
		return answer;
	}
}
