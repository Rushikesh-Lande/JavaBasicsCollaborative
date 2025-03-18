public class ShowVowelsCount{
public void getVowels(String str){
int count=0;
for(int i=0;i<=str.length()-1;i++){
char ch = str.charAt(i);
switch(ch){
case  'a':
case  'A':count++;break;
case  'e':
case  'E':count++;break;
case  'i':
case  'I':count++;break;
case  'o':
case  'O':count++;break;
case  'u':
case  'U':count++;break;

}

}
System.out.println("The vowels Count is:"+count);
}
public static void  main(String[] args){
ShowVowelsCount sv = new ShowVowelsCount();
sv.getVowels("Bhagwat");
}

}