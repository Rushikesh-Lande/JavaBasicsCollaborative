// write the program and remove the duplicate character from given string ?
class RemoveDuplicateChar
{
   public String removeDuplicate(String name)
{
   String result = " ";
   for(int i=0; i<=name.length()-1;i++)
{
    
    char ch = name.charAt(i);
    if(result.indexOf(ch)==-1)
    {
       result+=ch;
    }
}
    return result;   
}

public static void main (String[] args)
{
RemoveDuplicateChar obj = new RemoveDuplicateChar();
String dupCharRemoved=obj.removeDuplicate("Narayan");
System.out.println(dupCharRemoved);
}
}