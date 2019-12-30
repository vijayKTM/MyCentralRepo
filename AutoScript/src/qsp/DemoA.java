package qsp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		List<WebElement> atags = driver.findElements(By.tagName("a"));
		for(WebElement x:atags)
		{
			System.out.println(x.getText());
		}
		
//		driver.switchTo().activeElement().sendKeys("selenium");
//		Thread.sleep(3000);
//		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
//		
//		for(WebElement we:suggestions)
//		{
//			System.out.println(we.getText());
//		}
//		
		driver.close();
		
		
		
		
		
		
		}

}
