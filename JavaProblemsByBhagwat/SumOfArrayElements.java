public class SumOfArrayElements
{
public int sumElements(int[]a){
int sum=0;
for(int i=0;i<a.length;i++){
sum+= a[i];
}return sum;
}
public static void main(String[]args){
SumOfArrayElements se = new SumOfArrayElements();
int[]num={10,20,30,40,50};
int sum = se.sumElements(num);
System.out.println("The sum of elements in given array is :"+sum);
}
}