/*
 * Problem: Fibonacci Sequence (the sum of the previous two number)
 * Description: Write a program to print the first n numbers in the Fibonacci sequence, 
 * The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the previous two.
 */
public class FibonacciSequence
{
public static void main(String[] args)
{
int n=10;
int a = 0 ,b = 1;
System.out.print("Fibonacci sequesce :"+a +" "+b);
for(int i=0 ;i<n ; i++)
{
int c = a+b;
System.out.print (" "+c);
a=b;
b=c;
}
}
}