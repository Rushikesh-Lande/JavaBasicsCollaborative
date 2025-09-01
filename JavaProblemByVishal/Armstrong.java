//Armstrong Number
public class Armstrong{
public static void main(String[] args)
{
   int number=153;
   int orignal=number;
   int result=0;
   int lenOfDigits=String.valueOf(number).length();
   while(number!=0)
   {
    int lastDigit=number%10;
    result+=Math.pow(lastDigit,lenOfDigits);
    number=number/10;
   }
   
   if(orignal == result)
  {
    System.out.println("the number is armstrong");
  }
}
}