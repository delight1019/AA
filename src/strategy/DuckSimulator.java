package strategy;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallardDuck = new MallardDuck();
		Duck decoyDuck = new DecoyDuck();
		Duck redheadDuck = new ReadheadDuck();
		Duck rubberDuck = new RubberDuck();
		
		List<Duck> ducks = new ArrayList();
		ducks.add(mallardDuck);
		ducks.add(decoyDuck);
		ducks.add(redheadDuck);
		ducks.add(rubberDuck);
		
		for (Duck duck : ducks) {
			duck.display();
			duck.performFly();
			duck.performQuack();
		}
	}

}
