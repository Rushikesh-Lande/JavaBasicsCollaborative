//print the prime number
public class PrintPrimeNumber
{
public static void main(String[] args)
{

for(int i=2; i<100; i++)
{
Boolean isPrime=true;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
isPrime=false;
break;
}
}
if(isPrime)
{
System.out.print(i +" ");
}
}
}
}