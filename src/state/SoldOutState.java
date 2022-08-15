package state;

public class SoldOutState implements state.State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
    	
    	this.gumballMachine = gumballMachine;
	}
    
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");
	}

}
