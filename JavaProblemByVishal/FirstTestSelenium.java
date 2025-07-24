/*Q: Write a Selenium WebDriver Java program to automate the following scenario:
Launch the Chrome browser.
Open the Facebook login page (https://www.facebook.com/).
Print and validate the current URL.
Print and validate the page title.
Enter username and password into the login form.
Click the Login button.
Close the browser after the action.*/


package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTest {
	public static void main(String[] args) {
		
		// Set the path to ChromeDriver (if not set in system PATH)
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title =driver.getTitle();
		System.out.println(title);
		
		// Validate URL
		if(url.matches("https://www.facebook.com/"))
		{
			System.out.println("Valid app.....");
		}else
		{
			System.out.println("InValid app......");
		}
		
        // Validate Title
		if(driver.getTitle().matches("Facebook – log in or sign up"))
		{
			System.out.println("valid title.....");
		}
		
        // Interact with login form
		WebElement uName=driver.findElement(By.id("email"));
		uName.sendKeys("name");
		WebElement uPass=driver.findElement(By.id("pass"));
		uPass.sendKeys("name@123");
		WebElement login =driver.findElement(By.name("login"));
	    login.click();
	    // Close browser
        driver.quit();
	}
}
