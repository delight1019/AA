package command;

public class RemoteControl {
    private Command onCommand1;
    private Command onCommand2;
    private Command offCommand1;
    private Command offCommand2;
    private Command undoCommand;
    
    public RemoteControl() {
		// TODO Auto-generated constructor stub
    	onCommand1 = new NullCommand();
    	onCommand2 = new NullCommand();
    	offCommand1 = new NullCommand();
    	offCommand2 = new NullCommand();
    	undoCommand = new NullCommand();
	}

    public void setOnCommand(int slot, Command command){
    	if (slot == 1) {
    		onCommand1 = command;
    	}
    	else if (slot == 2) {
    		onCommand2 = command;
    	}
    }
    
    public void setOffCommand(int slot, Command command) {
    	if (slot == 1) {
    		offCommand1 = command;
    	}
    	else if (slot == 2) {
    		offCommand2 = command;
    	}
    }

    public void onButtonWasPushed(int slot){
Command command = new NullCommand();
    	
    	if (slot == 1) {
    		command = onCommand1;
    	}
    	else if (slot == 2) {
    		command = onCommand2;
    	}
    	
    	command.execute();
    	undoCommand = command;
    }

    public void offButtonWasPushed(int slot){
    	Command command = new NullCommand();
    	
    	if (slot == 1) {
    		command = offCommand1;
    	}
    	else if (slot == 2) {
    		command = offCommand2;
    	}
    	
    	command.execute();
    	undoCommand = command;
    }
    
    public void undoButtonWasPushed() {
    	undoCommand.undo();
    	undoCommand = new NullCommand();
    }
}
