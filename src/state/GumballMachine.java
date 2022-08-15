package state;

import java.io.BufferedReader;

public class GumballMachine {
	private State hasQuarterState;
	private State noQuarterState;
	private State soldOutState;
	private State soldState;
	private State winnerState;
	
	private State state;
	
	private int remains = 0;
	
	public GumballMachine(int value) {
		// TODO Auto-generated constructor stub
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		remains = value;
		
		if (remains > 0) {
			state = noQuarterState;
		}
		else {
			state = soldOutState;
		}
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	public void releaseBall() {
		System.out.println("�˸��̸� �������� �ֽ��ϴ�.");
		remains--;
	}
	
	public int getCount() {
		return remains;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();                                                                                                                                                                                
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("�ֽ�ȸ�� �ջ̱�\n");
		sb.append("�ڹٷ� ���ư��� �ֽ��� �̱� ���\n");
		sb.append("���� ����: ");
		sb.append(getCount());
		sb.append("��\n");
		
		if (getCount() == 0) {
			sb.append("����\n");
		}
		else {
			sb.append("���� ���� �����\n");
		}
		
		return sb.toString();
	}
}
