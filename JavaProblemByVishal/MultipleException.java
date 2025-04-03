
// write java the program that takes two numbers as inpute from the user and perform division 
import java.util.Scanner;
import java.util.InputMismatchException;
class MultipleException 
{ 
public static void main (String[] args)
{
 try(Scanner s = new Scanner(System.in);)
{
 System.out.println("Enter the first Number (Divident) : ");
 double num1 = s.nextDouble();
 System.out.println("Enter the Second Number (Divisor) : ");
 double num2 = s.nextDouble();
 double result = num1/num2; 
 System.out.println(result);
}catch(ArithmeticException | InputMismatchException ob)
{
   System.out.println("EnterNonZero Integer values only");
   System.out.println("Details :"+ob.getMessage());
   System.out.println("ExceptionClass_Type:"+ob.getClass());
}
}
}