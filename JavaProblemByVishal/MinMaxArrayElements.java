// find the min and max element from the araay 
public class MinMaxArrayElements {

	public static void main(String[] args) {

		int[] arr = { 20,10,30,40,50};
		
    	System.out.println("**********Enhanced  forEach loop************");

		int min=arr[0];
		int max=arr[0];
		for(int num:arr)
		{
		    if(num>max) {
		    	max=num;
		    }
		    if (num<min)
		    {
		    	min=num;
		    }
		}
    	System.out.println("Max Element :"+max);
    	System.out.println("Min Element :"+min);
    	
    	System.out.println("**********using for loop************");
    	int small = arr[0];
    	int large = arr[0];
    	for(int i =0; i<arr.length;i++) 
    	{
    		if(arr[i]<small)
    		{ 
    			small=arr[i];
    		}
    		if(arr[i]>large)
    		{
    			
    			large=arr[i];
    		}
    	}
		System.out.println("small element  :"+small);
		System.out.println("large element  :"+large);


	}

}

