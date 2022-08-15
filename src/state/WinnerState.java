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
		System.out.println("알맹이를 내보내고 있습니다.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이는 한 번만 돌려주세요.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
			return;
		}
				
		System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
		gumballMachine.releaseBall();
		
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else {
			System.out.println("더 이상 알맹이가 없습니다.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
