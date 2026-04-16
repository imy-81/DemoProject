package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//locators
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	
	
	
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//actions
	
	public void username(String usernamevalue)
	{
		
		username.sendKeys(usernamevalue);
	}

	public void pswrd(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
	}

	public void clickOnSignin()
	{
		signin.click();
	}
	
}
	


