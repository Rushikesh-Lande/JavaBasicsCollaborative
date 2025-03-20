//How can you find the factorial of an integer in Java using recursion ??

public class Factorial{
public int fact(int n){
if(n==1||n==0){
return 1;

}
return n*fact(n-1);
}

public static void main(String[] args){
Factorial f = new Factorial();
int result = f.fact(6);
System.out.println(result);
}

}