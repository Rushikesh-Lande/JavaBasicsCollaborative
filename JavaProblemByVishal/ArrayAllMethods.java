


import java.util.Arrays;
import java.util.List;
// array is an dataStructure in java 
// the sequenced collection of element of similer datatypes.
//array in java is an fixed size.
public class ArrayAllMethods {

	public static void main(String[] args) {
		
	//  How to Declared array in java ? ==> Syntax: dataType[] arrayName;
		int[] numbers;  // Declares an integer array
		
		
	//  9.how to Initialization Array
	   numbers = new int[15];// Initialization
		
    //  10.How do you Initialize an Array  with values ?
    //                0  1  2  3  4
		int[] arr = {30,10,50,20,40}; // the sequenced collection of element of similer datatypes 
		
		
		// 1.convert an array to string represantation.
		System.out.println(Arrays.toString(arr));
		
		// 2.find the length of an array ? ele
		System.out.println("Length of Array:"+arr.length);

        // 3.How do you access elements in an Array? Answer: Using the index:
		System.out.println("Access the Element from Array :"+arr[2]);
		
		// 4.What happens if you access an index outside the array bounds?
		//=> It throws an ArrayIndexOutOfBoundsException.
		//System.out.println("ArrayIndexOutOfBondException"+arr[6]);
		
		// 5.How do you sort Array?=> used Arrays.sort(arr_obj_ref)
		System.out.println("*****sorted array******");
		//arrays.sort() method will sort the array in ascending order
		Arrays.sort(arr);
		System.out.println("Shorted Arrays:"+Arrays.toString(arr));
		
		// 6.how do you fill the an array with specific values.
		System.out.println("*****filled array******");
		//filling an array with specific value(element)
		String[] str = new String[5];
		Arrays.fill(str,"vishal");
		System.out.println(Arrays.toString(str));
		
		// 7.how do we checked to arrays are equal or not 
		System.out.println("***checked Two Arrays are equal or not****");
		// checked Two Arrays are equal or not =>boolean isEqual = Arrays.equals(arr1, arr2);
		int [] a1={10,20,30,40};
		int [] a2={10,20,30,40}; 
		boolean isEqual=Arrays.equals(a1,a2);
		System.out.println(isEqual);
		
		// 8.how to search an element in an array
		System.out.println("*****binariSearch array******");
		//binarySearch-> when we want to find the index of element but array must be sorted   
		int [] array = {10,20,30,40};
		
		int index= Arrays.binarySearch(array, 30);
		System.out.println(index);
		
		
		// 11.what is an Anonymous Array ?
		//=> An array without a name, used for immediate initialization:
        //new int[] {1,2,3};
		
		// 12.How can i convert array to list?=>used Arrays.asList(arr);
		 String[] arr3 = {"Apple", "Banana", "Cherry"};
	        List<String> list = Arrays.asList(arr3);
		       
		//13. What is the difference between int[] arr and int arr[]?
		// Answer: Both are valid, but int[] arr is preferred for readability.
      
	        //How do you copy an Array in Java?
	       int[] a5={1,2,3,4,5};
	       int[] a6=Arrays.copyOf(a5, a5.length);
	       System.out.println(Arrays.toString(a6));
	       
         //14.how can we iterate the Array?
	      //=>Using for loop and ForEachloop
	       System.out.println("using for loop and ForEachloop");
	      for(int i = 0; i<a6.length;i++)
	      {
	    	System.out.println(a5[i]);  
	      }
	      
	      for (int i : a6) {
			System.out.println(i);
		}
	}

}
