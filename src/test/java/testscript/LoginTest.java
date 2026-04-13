package testscript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {

	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCred()
	{
		
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.username(usernamevalue);
		loginpage.pswrd(passwordvalue);
		loginpage.signin();
		
	}
}
