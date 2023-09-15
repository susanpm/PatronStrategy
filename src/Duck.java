public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	SwimBehavior swimBehavior;
   //extras 

   
	public Duck() {
		
			flyBehavior = new FlyWithWings();
			quackBehavior = new Quack();
			swimBehavior = new SwimDuck(); 
			
			
	
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	public void setSwimBehavior(SwimBehavior wb) {
		swimBehavior = wb;
	}

	

	abstract void display();

	public void perfomFly()
{
    flyBehavior.fly();
}

public void perfomQuack()
{
     quackBehavior.quack();
}

	public void performswim() {
		swimBehavior.swim();
	}
}


