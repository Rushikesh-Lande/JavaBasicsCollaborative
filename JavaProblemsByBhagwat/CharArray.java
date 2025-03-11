public class CharArray{
public static String convertString(String str){
String st = "";
System.out.println("\n*********covert a String into charArray********");
char[] a =str.toCharArray();
System.out.println("\n*********Character array is*******");
for(int i=0;i<a.length;i++){
System.out.print(a[i] +" ");
}
System.out.println("\n*********covert a String into char********");

for(int i=0;i<str.length();i++){
char ch =str.charAt(i);
System.out.print(ch + " ");
}
return st;
}

public static void main(String[] args){
CharArray ca = new CharArray();
String st = ca.convertString("java");
System.out.println(st);
}
}