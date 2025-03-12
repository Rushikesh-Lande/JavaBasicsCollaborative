public class DemoVowels{
public int vowelCounts(String str){
int count =0;
int len = str.length();
for(int i=0;i<len;i++){
 char ch = str.charAt(i);
switch(ch){
 case 'a': 
 case 'A':
 break;
 case 'e': 
 case 'E':
 break;
case 'i': 
 case 'I':
 break;
case 'o': 
 case 'O':
 break;
case 'u': 
 case 'U':
 break;

}
}return count;
}
public static void main(String[]args){
DemoVowels dv = new DemoVowels();
int count = dv.vowelCounts("Bhagwat");
System.out.println(count);


}


}