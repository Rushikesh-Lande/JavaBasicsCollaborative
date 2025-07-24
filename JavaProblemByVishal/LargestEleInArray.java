// Find the Largest Element in an Array ?
public class LargestEleInArray{
public static void main(String[] args)
{
 int[] number = {10,30,15,20,50};
 int max=number[0];
 for(int i=0; i<=number.length-1; i++)
 {
   if(number[i]>max)
   {
       max=number[i];
   }
 }
   System.out.println("Largest element is :"+max);
}
}
 