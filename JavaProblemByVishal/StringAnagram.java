// Check two string is anagram or not ?
import java.util.Arrays;
public class StringAnagram
{
public boolean isAnagram(String s1, String s2)
{
 if(s1.length() != s2.length())
 {
   return false;
 }else{
  	char[] ch1 = s1.toLowerCase().toCharArray();
	char[] ch2 = s1.toLowerCase().toCharArray();
        Arrays.sort(ch1);
	Arrays.sort(ch2);

     return Arrays.equals(ch1,ch2);      }
}

public static void main(String[] args)
{
 StringAnagram obj = new StringAnagram();
 Boolean result=obj.isAnagram("listen", "Silent");

 if(result == true)
	{System.out.println("IsAnagram");}
	else{System.out.println("NotAnagram");}
}
}