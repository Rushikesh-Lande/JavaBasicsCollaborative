//How can you find the factorial of an integer in Java using recursion?
public class FactorialRecursion 
{  

   public long factorial(int num)
   {  if(num==0 || num==1)
        {
        return 1;
	}
      return num*factorial(num-1);
   }



public static void main(String[] args)
{
   int number = 5;
   FactorialRecursion fR= new FactorialRecursion();
   long result = fR.factorial(number);
   System.out.println("factorial of "+number +" is "+result);
}
}

