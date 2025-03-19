//Write a Java program to find the largest and smallest number in an array?


public class LargeSmallElement{
public int[] findLargeSmall(int [] a){
int max = a[0];
int min = a[0];
for(int i=0;i<a.length;i++){
if(a[i]>max){
   max = a[i];
}
if(a[i]<min){
   min = a[i];
}
}
return new int[]{max, min};
}
public static void main(String []args){
LargeSmallElement le = new LargeSmallElement();
int []a ={1,2,3,4,5};
int [] result = le.findLargeSmall(a);
System.out.println("The Max Element is:"+result[0]);
System.out.println("The min Element is:"+result[1]);
}
}