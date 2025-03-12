// write one program and pass our Username and password and check username and password is matched or not ?
public class LoginString {

	public boolean athentication(String userName, String passWord) {

		String storedUsername = "Vishal";
		String storedPassword = "Vishal@123";

		if(userName.equals(storedUsername) && passWord.equals(storedPassword)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		LoginString ls = new LoginString();
		boolean suss = ls.athentication("Vishal", "Vishal@123");
		{
			if(suss) {
				System.out.println("Login successful! Welcome, ");

			}else {
				System.out.println("Incorrect username or password.");

			}
		}

	}
}
