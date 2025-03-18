//Write the program Constructor with parameter and pass the Username And password from object creation Syntax,
//and show the username and password using showUserNameAndPass() ? 
public class LoginDetails
{
 String username;
 String password;
 
 public LoginDetails(String a,String b)
{
       username=a;
       password=b;
}

public void showUserNameAndPass()
{
System.out.println("UserName is :"+username);
System.out.println("Password is :"+password);

}

public static void main(String[]  args)
{

LoginDetails ld = new LoginDetails("vishal","vishal@123");
ld.showUserNameAndPass();
}
}