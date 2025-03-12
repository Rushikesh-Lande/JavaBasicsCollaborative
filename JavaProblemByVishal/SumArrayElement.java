// sum of the array element ? 
public class SumArrayElement {

	public int sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // it will add the element values
		}
		return sum;
	}

	public static void main(String[] args) {

		SumArrayElement sAE = new SumArrayElement();
		int sum = sAE.sum(new int[] { 5, 10, 15, 20 });
		System.out.println(sum);
	}

}
