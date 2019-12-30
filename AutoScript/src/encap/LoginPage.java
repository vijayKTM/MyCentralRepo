package encap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//declaration 
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement lgnBtn;
	//initialization 
	public LoginPage(WebDriver driver) 
	{
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		lgnBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
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
