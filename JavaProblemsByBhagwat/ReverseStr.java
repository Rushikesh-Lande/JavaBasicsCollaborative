public class ReverseStr{
public static void main(String[]args){
String str ="javaprogram";
int len =str.length();
for(int i=len-1;i>=0;i--){
char ch = str.charAt(i);
System.out.print(ch);
}
}
}