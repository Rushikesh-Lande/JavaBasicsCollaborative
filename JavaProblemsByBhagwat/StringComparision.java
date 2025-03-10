public class StringComparision
{
public static void main (String [] args)
{
String s1 = "bhagwat";
String s2 = "bhagwat";
String s3 = new String("bhagwat");
System.out.println(s1.equals(s2));
System.out.println(s1==s2);
System.out.println(s1.equals(s3));
System.out.println(s1==s3);
}

}