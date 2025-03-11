
// reverse the given string Using for loop
public class StringReverse {

	public String reversedString(String str)
	{   int len = str.length();
		String reverse = "";
	    for(int i=len-1;i>=0;i--)
	    {
	    	char ch =str.charAt(i);
	    	 reverse+=ch;
	    }
		return reverse;
	}

	public static void main(String[] args) {


		StringReverse rs = new StringReverse();
		
		String reverse = rs.reversedString("vishal");
	    System.out.print(reverse);
	}

}
