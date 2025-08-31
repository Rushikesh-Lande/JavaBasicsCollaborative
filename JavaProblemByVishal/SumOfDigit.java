// Sum of Digits of a Number Input: 12345 → Output: 15


public class SumOfDigit
{
public static void main(String[] args)
{
int input=12345;
int sum=0;
while(input!=0)
{
int lastDigit=input%10;
sum+=lastDigit;
input=input/10;
}
System.out.println(sum);
}
}