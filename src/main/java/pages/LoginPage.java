package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	
	
	
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement user;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement pswd;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void username(String usernamevalue)
	{
		user.sendKeys(usernamevalue);
	}
	

	public void pswrd(String passwordvalue)
	{
		pswd.sendKeys(passwordvalue);
	}

	public void signin()
	{
		signin.click();
	}
	
}
