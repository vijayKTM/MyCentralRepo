package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.EmailPage;
import pom.PasswordPage;

public class TestCredentials {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		EmailPage e=new EmailPage(driver);
		PageFactory.initElements(driver, e);
		e.getEmailID("hnsagarnag");
		Thread.sleep(3000);
		PasswordPage p=new PasswordPage(driver);
		p.getPassword("243567834567");
		
		
		
		
		
		
	}

}
