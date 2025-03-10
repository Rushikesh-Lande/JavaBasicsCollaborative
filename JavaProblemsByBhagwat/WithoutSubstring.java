import java.util.Scanner;
public class WithoutSubstring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String:");
		String st = s.nextLine();
		System.out.println("Enter the Start Index:");
		int a = s.nextInt();
		System.out.println("Enter the End Index:");
		int b = s.nextInt();
		    String result="";
			for(int i=a;i<b;i++) {
				char ch=st.charAt(i);
				result+=ch;
		}System.out.println(result);
	s.close();	
	}

}