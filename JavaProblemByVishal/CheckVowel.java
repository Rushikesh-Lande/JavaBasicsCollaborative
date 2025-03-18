//Write a Java program to check if a vowel is present in a string ?
public class CheckVowel
{
public void isVowelPresent(String str){
        
   int count=0;
    for(int i = 0;i<=str.length()-1;i++)
    { 
     char ch = str.charAt(i);

     switch(ch)
     {
       case 'a': 
       case 'A': count++; break;
       case 'e':
       case 'E': count++; break;
       case 'i':
       case 'I': count++; break;
       case 'o':
       case 'O': count++; break;
       case 'u': 
       case 'U': count++; break;
     } 
    }   

  if(count>0)
    { System.out.println("yes Vowels is Present........"); }
    else{
    System.out.println("Vowels is not present ......");
      }
}
public static void main(String[] args)
{
CheckVowel cv = new CheckVowel();
cv.isVowelPresent("vishal");

}
}