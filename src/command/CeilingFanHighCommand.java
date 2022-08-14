package command;

public class CeilingFanHighCommand implements command.Command {
	private CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
		prevSpeed = CeilingFan.OFF;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
		else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		}
		else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		}
		else if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		}
	}

}
