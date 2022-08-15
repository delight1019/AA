package state;

public class WinnerState implements state.State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
    	this.gumballMachine = gumballMachine;
	}
    
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�˸��̸� �������� �ֽ��ϴ�.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�̹� �˸��̸� �����̽��ϴ�.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�����̴� �� ���� �����ּ���.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
			return;
		}
				
		System.out.println("���ϵ帳�ϴ�! �˸��̸� �ϳ� �� ������ �� �ֽ��ϴ�.");
		gumballMachine.releaseBall();
		
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else {
			System.out.println("�� �̻� �˸��̰� �����ϴ�.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
