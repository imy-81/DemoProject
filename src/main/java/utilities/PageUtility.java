package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
//dropdown
	
	public void selectByVisibleTextMethod(WebElement element, String text )
	
	{	Select select =new Select(element);
	select.selectByVisibleText( text);
	}
	public void selectByValue(WebElement element, String value )	
		
{Select select =new Select(element);
select.selectByValue( value);	
}	
		
public void selectByIndex(WebElement element, String index)		
{Select select =new Select(element);
select.selectByVisibleText( index);
}		
//javascriptexecutor
public void scriptExecutorByValueMethod(WebDriver driver,WebElement country)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='value';",country );	
			}
public void  scriptExecutorByClickMethod(WebDriver driver,WebElement name)
{JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("arguments[0].click();", name);	
	
}
public void scriptExecutorByScrollMethod(WebDriver driver,WebElement country)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeAsyncScript("window.scrollBy", 0,150,"");

}

				
	//actions		

	public void doubleClickMethod(WebDriver driver,WebElement click)	
	{Actions act=new Actions(driver);
act.doubleClick(click).perform();
			
	}	
		
	public void rightClickMethod(WebDriver driver,WebElement rtclick)	
	{Actions act=new Actions(driver);
act.contextClick(rtclick).perform();
			
	}			
	public void MouseHoverMethod(WebDriver driver,WebElement mouse)	
	{
		
		Actions act=new Actions(driver);

	act.moveToElement(mouse).perform();
	}

	public void DragAndDrop(WebDriver driver,WebElement drag,WebElement drop)
	{Actions act=new Actions(driver);
	act.dragAndDrop(drag,drop ).perform();
		}	





}
