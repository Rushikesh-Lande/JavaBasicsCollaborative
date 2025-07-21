 //check The given number  is palindrome or not

public class palindromeNumber
{
public static void main(String[] args)
{
int number =32123;
int orignalNum= number;
int reversed = 0;

while(number!=0)
{
int lastDigit=number%10; 
reversed=reversed*10+lastDigit;
number=number/10;
}
if(orignalNum == reversed)
{
System.out.println("Number is palindrom");
}
else
{
System.out.println("Number is Not palindrom");
}

}
}