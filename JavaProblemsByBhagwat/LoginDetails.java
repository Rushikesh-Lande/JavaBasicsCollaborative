public class LoginDetails{
String userName;
String password;
LoginDetails(String a,String b){
 userName=a;
 password=b;
}
void getLoginDetails(){
System.out.println("username is :"+userName);
System.out.println("Password is :"+password);
}

public static void main(String[]args){
LoginDetails ld =new LoginDetails("Bhagwat","bhagwat@b");
ld.getLoginDetails();
}

}