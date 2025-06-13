//Write a Java program to check if the given number is a prime number?
public class CheckPrimeNumber 
{

public void isPrimeNumber(int num)
{

if(num<=1)
{
System.out.println("Non-Prime");
return;
}

Boolean isPrime=true;
for(int i=2; i<num;i++)
{
if(num%i==0){
  isPrime=false;
  break;
}
}

if(isPrime)
{
System.out.println("Prime");

}else{
System.out.println("Non-Prime");

}

}
public static void main(String[] args)
{
CheckPrimeNumber cpn = new CheckPrimeNumber();
cpn.isPrimeNumber(15);
}
}