//Find Missing Number in Array (1 to N)?
public class MissingNumArray{
public static void main(String[] args)
{
int[] arr = {1,2,4,5}; // initialize array with values 
int n = 5;
int expectedSum=n*(n+1)/2; 
int actualSum=0;
for (int num:arr){
actualSum+=num;
}
int missing = expectedSum-actualSum;
System.out.println("missing Number :"+missing);
}
}