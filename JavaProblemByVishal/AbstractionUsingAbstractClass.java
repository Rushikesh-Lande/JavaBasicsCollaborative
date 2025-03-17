// how can we achive abstraction using abstract class?  
abstract class Vehicle {

	public abstract void start();
	public void stop() {
		System.out.println("vehicle is stoped.....");
	}
}

class Car extends Vehicle{
	@Override
	public  void start()
	{
		 System.out.println("My Car is Start with button ....");

	}
	
}
class Bike extends Vehicle{
	@Override
	public void start()
	{
	      System.out.println("My Bike is Start with Kick ....");

	}
}
class AbstractionUsingAbstractClass{
	public static void main(String[] args)
	{
	Car car = new Car();
	Bike bike = new Bike();
	car.start();
	car.stop();
	bike.start();
	bike.stop();
	}
}