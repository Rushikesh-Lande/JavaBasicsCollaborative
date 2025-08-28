public class CheckAnagram {
public static void main(String[] args)
{
   String s1 = "listen";
   String s2 = "silent";
   
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

   int sum1=0; int sum2=0;
 
   for(int i=0;i<s1.length();i++)
   {
       sum1+=(int)s1.charAt(i);
   }
   for(int i=0;i<s2.length();i++)
   {
      sum2+=s1.charAt(i);
   }

   if(sum1==sum2)
   {
     System.out.println("string is Anagram");
   }else{
     System.out.println("string is not Anagram");
   }
}
}