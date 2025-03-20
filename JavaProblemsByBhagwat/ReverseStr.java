//Write a program to reverse a String 
public class ReverseStr{
public static String reverse(String str){
String st="";
int len =str.length();
for(int i=len-1;i>=0;i--){
char ch = str.charAt(i);
st+=ch;
}
return st;
}
public static void main(String [] args){
ReverseStr rs = new ReverseStr();
String st =rs.reverse("Hello");
System.out.println(st);
}
}
