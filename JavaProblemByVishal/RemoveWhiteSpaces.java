//18. Remove White Spaces from String
//Input: "a b c" → Output: "abc"
public class RemoveWhiteSpaces
{
 public static void main(String[] args) {
 String str = "a b c";
 String result ="";
  
 for(int i=0; i<str.length();i++)
 { 
   char ch =str.charAt(i);
   if(ch !=' ')
    {
          result+=ch;
    }
 }
  
System.out.println("Original String: " + str);
System.out.println("Without Spaces: " + result);}
}
