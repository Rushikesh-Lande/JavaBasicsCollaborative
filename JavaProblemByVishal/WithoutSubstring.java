//Write a Java program to extract a substring from a given string without 
//using the substring() method. The program should take an input string and two indices
//(startIndex and endIndex) and return the substring.


public class WithoutSubstring {

	public String show(String str, int startIndex, int endIndex) {
		String result = "";
		if (startIndex >= 0 && endIndex <= str.length())
		{
			int len = str.length();
			for (int i = startIndex; i < endIndex; i++) 
			{
				result += str.charAt(i);
			}

		}
		else {
			System.out.println("invalid index");
		}

		return result;

	}

	
	public static void main(String[] args) {
		
		WithoutSubstring ws = new WithoutSubstring();
		String result=ws.show("helloworld", 2, 15);
		System.out.println(result);
	}

}