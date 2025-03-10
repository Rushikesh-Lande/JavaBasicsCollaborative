// reverse the given string Using for loop
public class StringReverse {

	public static void main(String[] args) {

		String str = "vishal";
		int len = str.length();
	    for(int i=len-1;i>=0;i--)
	    {
	    	char ch =str.charAt(i);
	    	 System.out.print(ch);
	    }
	    System.out.println("\n******************");
	    
	    String reverse = "";
	    for(int i=len-1;i>=0;i--)
	    {
	    	char ch =str.charAt(i);
	    	 reverse+=ch;
	    }
	    System.out.print(reverse);
	}

}