package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailTB;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtn;
	
	public EmailPage(WebDriver driver)
	{
//		PageFactory.initElements(driver, this);
	}
	
	public void getEmailID(String email)
	{
		emailTB.sendKeys(email);
		nextBtn.click();
	}
	

	
	
}
