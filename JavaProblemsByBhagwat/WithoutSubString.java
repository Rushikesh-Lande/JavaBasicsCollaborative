//Write a program to print the specific Characters in the given string 
import java.util.Scanner;
public class WithoutSubString {
public String  display(String str ,int a,int b){
String st ="";
int len = str.length();
for(int i=a;i<=b;i++){
    st+=str.charAt(i);
}
return st;

}
public static void main(String args[]){
WithoutSubString ws = new WithoutSubString();
String st = ws.display("Helloworld",2,7);
System.out.println(st);
}
}