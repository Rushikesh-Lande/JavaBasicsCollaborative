
public class DemoStringBuffer{
public static void main (String[]args){
StringBuffer sb = new StringBuffer(4);
System.out.println("default capacity :"+sb.capacity());
System.out.println("length"+sb.length);
sb.append("bhagwat");
System.out.println("capacity:"+sb.capacity());
System.out.println("length"+sb.length);
sb.append("vidhole");
System.out.println("capacity:"+sb.capacity());
System.out.println("length"+sb.length);

}
}