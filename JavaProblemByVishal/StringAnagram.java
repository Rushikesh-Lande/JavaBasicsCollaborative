// Check two string is anagram or not ?

public class StringAnagram
{
public boolean isAnagram(String s1, String s2)
{
 
   s1 =s1.toLowerCase();
   s2 =s2.toLowerCase();
            
            int sumofchofs1=0;
            int sumofchofs2=0;

	    for(int i=0;i<s1.length();i++)
	    {	  
              char ch1 =s1.charAt(i);
              sumofchofs1+=(int)ch1;
            }
  
            for(int i=0;i<s2.length();i++)
	    {	  
              char ch2 =s2.charAt(i);
              sumofchofs2+=(int)ch2;
            }
            int sub = sumofchofs1-sumofchofs2;
           
          return sub == 0;
}

public static void main(String[] args)
{
 StringAnagram obj = new StringAnagram();
 boolean result =obj.isAnagram("listen","Silent");
           if(result)
            {
              System.out.println("isAnagram");
            }else{
              System.out.println("Strings are notAnagram");
            }
}
}