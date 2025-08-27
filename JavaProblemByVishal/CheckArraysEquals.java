// Check two array are equals are not 
import java.util.Arrays;
public class CheckArraysEquals{

public static void main(String[] args)
{
  int[] arr1 = {1,2,3,4,5};
  int[] arr2 = {1,2,3,4,5};
  if(Arrays.equals(arr1,arr2))
  {
    System.out.println("arrays are equals");
  }else
  {
       System.out.println("arrays are not equals");
  }
}
}