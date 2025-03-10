
// how to convert string into charArray ?
// using toCharArray() method to convert given String into charcter Array
// how to convert String into  charcter?
//using charAt() method to convert given String into character 


public class StringConvert {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println("*********convert the given String into CharArray*********");
		char[] charArry=str.toCharArray();  // returntype char[]
		System.out.println("\n ********** using inhance foreach********");
		for(int i = 0; i<charArry.length;i++)
		{
			System.out.print(charArry[i]+" ");

		}
		
		System.out.println("\n ********** using inhance foreach********");
		for (char c : charArry) {
			System.out.print(c +" ");
		}
		
		
		System.out.println("\n*********convert the given String into charcter*********");

		for(int i =0; i<str.length();i++) {
			char ch =str.charAt(i); // returntype char
			System.out.println(ch);
		}
		
	}

}
