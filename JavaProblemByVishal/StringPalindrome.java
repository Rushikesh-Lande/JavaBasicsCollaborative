//Q: check the given string is palindrome or not input as a madam 
public class StringPalindrome {
public static void main(String[] args)
{
String str = "madam";
String reversed = "";

for(int i=str.length()-1; i>=0; i--)
{
    reversed+=str.charAt(i);
}

if(str.equals(reversed))
{
System.out.println(str + " String is Palindrome");
}else
{
System.out.println(str + " String is Not Palindrome");
}

}
}