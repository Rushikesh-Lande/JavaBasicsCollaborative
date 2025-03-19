public class CheckPrimeNumber
{
  public void isPrimeNumberPresent(int num)
 {
   for (int i=2; i<=num-1;i++)
   {
    if(num%i==0)
    {
         System.out.println(+num +" isNonPrime Number"); 
         break;     
    }else {
         System.out.println(+num +" isPrime Number"); 
         break;         
    }
   }     
 }

public static void main(String[] args)
{
   CheckPrimeNumber primeNum = new CheckPrimeNumber();
   primeNum.isPrimeNumberPresent(6);
}
}