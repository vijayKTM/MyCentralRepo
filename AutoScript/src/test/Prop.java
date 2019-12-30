package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import encap.LoginPOMPage;

public class Prop {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void getData() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		FileInputStream fis=new 
				FileInputStream(new File("./TestData/prop.properties"));
		Properties p=new Properties();
		p.load(fis);
		driver.get(p.getProperty("url"));
		LoginPOMPage lp=new LoginPOMPage(driver);
		lp.getUsername(p.getProperty("username"));
		lp.getPassword(p.getProperty("password"));
		lp.clickLogin();
		
		
		
	}

}
