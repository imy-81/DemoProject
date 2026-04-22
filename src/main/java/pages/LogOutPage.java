package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutPage {

	//locators
	
	
	//@FindBy(xpath = "//p[contains(text(),'Settings')]")
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")

	WebElement btndropdown;
	

	@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Logout']")
	WebElement logoutbtn;
	
	
	//constructors
		public WebDriver driver;
		
		public LogOutPage(WebDriver driver)
		{
			
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
	
	
		}	
		
		

		//actions
		
		public void dropdown()
		{
			
			btndropdown.click();
			
			
			
			
		}	
		

		
		public void clickLogout()
		
		{
			
		
		
			logoutbtn.click();
			
			
			
		}
		
		
		
		
	}	
		
		
	
	
	
	
	
	
	
	
