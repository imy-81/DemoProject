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
	
	
	@FindBy(xpath = "//p[contains(text(),'Settings')]")
	WebElement btndropdown;

	@FindBy(xpath = "//p[text()='Logout']")
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
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", logoutbtn);
			
		
			
			
			
			
			
		}
		
	}	
		
		
	
	
	
	///*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.elementToBeClickable(logoutbtn));	*///
	
	
	
	
	
	
