import java.util.Arrays;

public class CheckEqualityOfArray{

    public static void main(String[] args)
    {
       int[] arr1={1,2,3,4,5};
       int[] arr2={1,2,3,4,5};
       //Approch 1) using Arrays.equals();
       boolean status =Arrays.equals(arr1,arr2);
       if(status==true)
       System.out.println("Arrays are Equals");
       else{
           System.out.println("Arrays are not Equal");
       }
       
       // Approch 2) without using Builtin Method
       boolean isEqual=true;
       
       if(arr1.length != arr2.length)
       {
           isEqual=false;
           
       }
       
       for(int i=0; i<arr1.length;i++)
       {
           if(arr1[i] != arr2[i])
           {
               isEqual=false;
               break;
           }
       }
       
       if(isEqual)
       {
           System.out.println("Arrays are equals");
       }
       else{
           System.out.println("Arrays are not equal");

       }
        
    }
}
    
