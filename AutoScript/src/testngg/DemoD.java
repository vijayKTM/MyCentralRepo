package testngg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import encap.LoginPOMPage;

public class DemoD {
	
	public static WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	
	@BeforeTest
	public void setProp()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	@Parameters({"username","password"})
	public void testValidLogin(String username,String password) throws InterruptedException
	{
		LoginPOMPage lp=new LoginPOMPage(driver);
		lp.getUsername(username);
		lp.getPassword(password);
		lp.clickLogin();
		Thread.sleep(4000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
