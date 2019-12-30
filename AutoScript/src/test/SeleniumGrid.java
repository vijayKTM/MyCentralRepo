package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import encap.LoginPOMPage;

public class SeleniumGrid 
{
	
	@Test
	@Parameters({"nodeURL","browserName"})
	public void testGrid(String nodeURL,String browserName) throws MalformedURLException
	{
		URL u=new URL(nodeURL);
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(browserName);
		WebDriver driver=new RemoteWebDriver(u, dc);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");


		LoginPOMPage lp=new LoginPOMPage(driver);
		lp.getUsername("admin");
		lp.getPassword("manager");
		lp.clickLogin();
		
		
		
	}

}
