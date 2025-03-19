//Write a Java program to find the largest and smallest number in an array?
public class MinAndMaxArray
{
public void showArray(int[] arr)
  {   int max=arr[0];
      int min=arr[0];
      for(int num:arr)
      { if(num<min)
        {
        min=num;
        }

       if(num>max)
        {
	max=num;
        }
      }
   System.out.println("smallest values :"+min);
   System.out.println("largest values :"+max);

  }
public static void main(String[] ars)
{
MinAndMaxArray minmax= new MinAndMaxArray();
minmax.showArray(new int[]{10,50,20,40,30});

}
}