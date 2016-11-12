package net.zjh.strategy;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public Duck(){
		
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior = qb;
	}
}
