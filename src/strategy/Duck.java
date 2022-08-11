package strategy;

public class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly(){
    	flyBehavior.fly();
    }

    public void performQuack(){
    	quackBehavior.quack();
    }

    public void display(){
    }

}
