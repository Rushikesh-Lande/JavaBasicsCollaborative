//Create a method check age if ages less than 18 then throw an illegal argument exception using throw call the method 
//inside main() and handle the exception Modified shake age in age to declare throws illegal argument exception 
//instant of handling it inside the method
class ValidationException 
{
public void checkAge(int age) throws IllegalArgumentException
{
if(age<18){
  throw new IllegalArgumentException("your age must be 18 years++");
}
  System.out.println( "your age is valid ....");

}

public static void main(String[] args)
{
   ValidationException ob = new ValidationException();
try{
   ob. checkAge(17);
}
catch(IllegalArgumentException iae)
 {
	System.out.println("Details : "+iae.getMessage());
 }
}
}