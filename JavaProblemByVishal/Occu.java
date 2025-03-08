class Occu
{
public String check(String str )
{
String reversed=str.reverse().toString();
return reversed;
}

public static void main(String args[])
{
Occu oc = new Occu();
String abc =oc.check("vishal");//lashiv
System.out.println(abc);

}

}