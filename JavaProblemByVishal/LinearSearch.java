//LinearSearch 50
public class LinearSearch
{
public static void main(String[] args)
{
 int[] arr = {10,20,50,30,40};
 int targate =30;
 boolean found = false;
 for(int i =0;i<arr.length;i++)
{
   if(targate == arr[i])
   {
      System.out.println("Element found at : "+i);
      found = true;
      break;
   }
}
  if(found==false)
  {
    System.out.println("Element not found in array");  
  }
}
}
