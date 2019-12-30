package encap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMPage {
	//declare
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(partialLinkText = "Login")
	private WebElement lgnBtn;
	
	
	//initialize
	public LoginPOMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization 
		public void getUsername(String un)
		{
			unTB.sendKeys(un);
		}	
		public void getPassword(String pw)
		{
			pwTB.sendKeys(pw);
		}
		public void clickLogin()
		{
			lgnBtn.click();
		}
		

}
