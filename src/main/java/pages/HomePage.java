package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	//locators
	
	
	//@FindBy(xpath = "//p[contains(text(),'Settings')]")
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")

	WebElement btndropdown;
	

	@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Logout']")
	WebElement logoutbtn;
	@FindBy(xpath = "//p[contains(text(),'Manage News')]/ancestor::div[contains(@class,'small-box')]//a")
	WebElement manageinfo;
	
	//constructors
		public WebDriver driver;
		
		public HomePage(WebDriver driver)
		{
			
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
	
	
		}	
		
		

		//actions
		
		
		
		public ManageNewsPage clickOnManageNews() {
			manageinfo.click();
			return  new ManageNewsPage(driver);
		}	
		
		public void dropdown()
		{btndropdown.click();
		}
public void clickLogout()
		
		{	logoutbtn.click();
		}	
			

			
			
		

		
		
			
		
		
			
			
			
			
		
		
		
		
		
	}	
		
		
	
	
	
	
	
	
	
	
