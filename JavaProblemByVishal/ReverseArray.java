// reverse the array ?
import java.util.Arrays;

public class ReverseArray {

   public int[] reverse(int[] arr )
   {
	    int[] arr1= {10,20,30,40}; 
		int [] arr2= new int[arr1.length];

		int a=0; 
		for(int i=arr1.length-1; i>=0; i--)
		{
			arr2[a]=arr1[i];
			a++;	
		}    
		//System.out.println(Arrays.toString(arr2)); 
		return arr2;
   }

	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
        //int[] arr = {10, 20, 30, 40}; 
        int[] reversedArr = ra.reverse(new int[]{10, 20, 30, 40}); 
        System.out.println(Arrays.toString(reversedArr));

	}

}
