// find the duplicate element in array
public class DuplicateEleArry{
public static void main(String[] args)
{
int[] arr={1,2,3,4,2,5};
boolean isDuplicate=false;
  for(int i=0; i<arr.length; i++)
   {
     for(int j=i+1; j<arr.length;j++)
     {
       if(arr[i]==arr[j])
        {
           System.out.println("duplicate Element is :"+arr[i]); 
           isDuplicate= true;
        }
     }
   }
  if(isDuplicate == false)
  {
   System.out.println("duplicate element not found");
  }
}
}