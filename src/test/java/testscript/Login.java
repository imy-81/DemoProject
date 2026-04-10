package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base {

	@Test(priority=1)
	public void loginWithValid()
	
	
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement user=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		user.sendKeys("admin");
		
		WebElement pswd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pswd.sendKeys("admin");
		
		WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		signin.click();
		
	}
	
	@Test(priority=2)
	
	public void loginWithInvalidPswd()
	
	
	{
		

		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement user1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		user1.sendKeys("admin");
		
		WebElement pswd1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pswd1.sendKeys("admin123");
		
		WebElement signin1=driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		signin1.click();
	}
		
		
		
@Test(priority=3)
	
	public void loginWithInvalidUser()
	
	
	{
		

		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement user2=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		user2.sendKeys("admin123");
		
		WebElement pswd2=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pswd2.sendKeys("admin");
		
		WebElement signin2=driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		signin2.click();
	}
		
		
		
@Test(priority=4)

public void loginWithInvalid()


{
	

	driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
	WebElement user3=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
	user3.sendKeys("admin123");
	
	WebElement pswd3=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	pswd3.sendKeys("admin456");
	
	WebElement signin3=driver.findElement(By.xpath("//button[text()='Sign In']"));
	
	signin3.click();
}
	
	
	
	
	
	
}
