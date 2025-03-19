public class PrimeNumber{
public void isPrime(int num){
for(int i=2;i<=num-1;i++){
if(num%i==0){
System.out.println(num+ "it is non prime number:");
break;
}
else{
System.out.println(num+ "it is  prime number:");
break;
}
}
}
public static void main(String []args){

PrimeNumber pn = new PrimeNumber();
pn.isPrime(5);
}
}