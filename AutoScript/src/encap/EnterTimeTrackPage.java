package encap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterTimeTrackPage {
    //declare
	private WebElement logoutLink;
	
	//initialize
	public EnterTimeTrackPage(WebDriver driver)
	{
		logoutLink=driver.findElement(By.linkText("Logout"));
	}
	
	//utilize
	
	public void clickLogout()
	{
		logoutLink.click();
	}
	
	
	
	
	
}
