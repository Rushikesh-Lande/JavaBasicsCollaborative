public class SumArrayElement {

	public static void main(String[] args) {
      
		int [] arr = {5,10,15,20};  //scequence collection of element of same datatypes
		System.out.println(arr.length);// to findd tthe lenth of array
		int sum = 0;
		for(int i = 0;i <arr.length;i++)
		{
		   	sum+=arr[i]; // it will add the element values 
		}
		System.out.println(sum);
	}

}
