//Find the min element in an array
public class MinArray{
public static int minElement(int[]a ){
int min =a[0];
for(int i=0;i<a.length;i++){
if(a[i]<min){
   min=a[i];
}
}return min;
}
public static void main (String[]args){
MinArray ma = new MinArray();
int[]a = {10,20,30,40,50};
System.out.println("Min Array Is :"+ma.minElement(a));
}
}