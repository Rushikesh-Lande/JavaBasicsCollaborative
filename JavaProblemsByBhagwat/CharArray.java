public class CharArray{
public static void main(String[] args){
String str = "java";
System.out.println("*********covert a String into charArray********");
char[] a =str.toCharArray();
System.out.println("*********Character array is*******");
for(int i=0;i<a.length;i++){
System.out.print(a[i] +" ");
}
System.out.println("*********covert a String into char********");

for(int i=0;i<str.length();i++){
char ch =str.charAt(i);
System.out.print(ch + " ");
}

}
}