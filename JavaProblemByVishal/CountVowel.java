// count the vowel from the given String ?
public class CountVowel
{

public int vowelsCount(String name)
{
     int len = name.length();

     int count=0;
     for(int i = 0; i<=len-1;i++)
     {
     char ch = name.charAt(i);
     switch(ch){
     case 'a':
     case 'A':count++;break;
     case 'e':
     case 'E':count++;break;
     case 'i':
     case 'I':count++;break;
     case 'o':
     case 'O':count++;break;
     case 'u':
     case 'U':count++;break;
     }
     }
     return count;


}

public static void main(String[] args)
{
CountVowel cv = new CountVowel();
int countVowels =cv.vowelsCount("vishal");
System.out.println(countVowels);
}
}