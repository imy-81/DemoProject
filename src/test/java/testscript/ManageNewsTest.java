package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageNewsTest extends Base {
HomePage homepage;
ManageNewsPage managenew;
	@Test(description="test Case")
	
	public void verifyManageNewsTest() throws IOException
	
	{
		
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		
		String passwordvalue=ExcelUtility.getStringData(1, 1,"loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.username(usernamevalue).pswrd(passwordvalue);
		//loginpage.pswrd(passwordvalue);
		homepage=loginpage.clickOnSignin();

		String newsContent = ExcelUtility.getStringData(0, 0, "managenews");
		//ManageNewsPage managenew=new ManageNewsPage(driver);
		
		managenew=homepage.clickOnManageNews();
		managenew.newButton().enterTheNews(newsContent).saveButton();
	
		//managenew.enterTheNews(newsContent);
		
		//managenew.saveButton();
		
		boolean message= managenew.isSuccessMsgDisplayed();
		Assert.assertTrue(message);
		
	/*	FakerUtility utility=new FakerUtility();
		String username=utility.createRandomFirstName();*/
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
