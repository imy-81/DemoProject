package testscript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(priority=1)
	public void verifyTheUserIsAbleToLoginUsingValidCred() throws IOException
	{
		
		//String usernamevalue="admin";
		//String passwordvalue="admin";
		
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		
		String passwordvalue=ExcelUtility.getStringData(1, 1,"loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.username(usernamevalue);
		loginpage.pswrd(passwordvalue);
		loginpage.clickOnSignin();
		
	}
	
	
	@Test(priority=2)
	public void verifyTheUserIsAbleToLoginUsinginValidPswrd() throws IOException
	{
		
		//String usernamevalue="admin";
		//String passwordvalue="admin123";
		String usernamevalue=ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.username(usernamevalue);
		loginpage.pswrd(passwordvalue);
		loginpage.clickOnSignin();
		
	}
	@Test(priority=3)
	
	public void verifyTheUserIsAbleToLoginUsinginValidUser() throws IOException
			
			{
		//String usernamevalue="admin123";
		//String passwordvalue="admin";
		String usernamevalue=ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.username(usernamevalue);
		loginpage.pswrd(passwordvalue);
		loginpage.clickOnSignin();
			}	
			
@Test
	
	public void verifyTheUserIsAbleToLoginUsinginValidBoth() throws IOException
			
			{
		//String usernamevalue="admin123";
		//String passwordvalue="admin456";
	String usernamevalue=ExcelUtility.getStringData(4, 0, "loginpage");
	String passwordvalue=ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.username(usernamevalue);
		loginpage.pswrd(passwordvalue);
		loginpage.clickOnSignin();
			}	

}