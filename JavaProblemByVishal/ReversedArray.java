//reverse the Array 
import java.util.Arrays;
public class ReversedArray
{
public static void main(String[] args)
{
   int[] arr ={1,2,3,4,5};  // original array //arr.length= 5  
   int[] revArr = new int[arr.length];  //arr.length = 5 → revArr has size 5 → [0,0,0,0,0] initially
   
   int a=0;
  for(int i =arr.length-1;i>=0; i--)
  {
      revArr[a]=arr[i];
      a++;
  }
   
 System.out.println("reversed Array : "+Arrays.toString(revArr));
}
}