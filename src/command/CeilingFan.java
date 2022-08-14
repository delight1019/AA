package command;

public class CeilingFan {
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
    private int speed;

    public void low(){
    	speed = LOW;
    }

    public void medium(){
    	speed = MEDIUM;
    }

    public void high(){
    	speed = HIGH;
    }
    
    public void off() {
    	speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }

}
