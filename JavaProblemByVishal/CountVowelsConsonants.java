public class CountVowelsConsonants 
{
	public static void main(String[] args) {
		String string = "Hello";
		String str=string.toLowerCase();
		 
		int count = 0; int consonant=0;
		for (int i=0;i<str.length();i++)
		{
		    char ch =str.charAt(i);
		   
		   if(ch >= 'a' && ch <= 'z') // if character is available then it will check 
		   {                         //if space or number then it will not go inside the switch
		    switch(ch)
		    {
		        case 'a':count++;
		        break;
		        case 'e':count++;
		        break;
		        case 'i':count++;
		        break;
		        case 'o':count++;
		        break;
		        case 'u':count++;
		        break;
		        default :consonant++;  
		    }
		   }
		    
		}
		if(count != 0)
		{
		    System.out.println("vowels is Present ....");
		}else
		{
	        System.out.println("vowels is not Present ....");
		}
		
		System.out.println("number of vowels is : "+count+"   &   number of consonants is : "+consonant);
		
	}
}