// how can we achive Abstraction using Interface ?
interface Animal {
 
	public abstract void voice();
	public abstract void food();
	
}
class Dog implements Animal{

	@Override
	public void voice() {
    System.out.println("dog voice is Bhoo Bhoo.........");		
	}

	@Override
	public void food() {
	    System.out.println("Non-veg........");		
		
	}
	
}
class Elephant implements Animal
{   @Override
    public void voice()
    {
        System.out.println("Elephant voice is eeeee.........");		

    }
    @Override
    public void food()
    {
        System.out.println("Elephant is vegetarin.........");		

    }
	
}
 class AbstractionUsingInterface
{
	public static void main(String[] args)
	{
		Elephant e = new Elephant();
		e.voice();
		e.food();
		Dog d = new Dog();
		d.voice();
		d.food();
	}
}
