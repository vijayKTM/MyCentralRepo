package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DDL {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/demo.html");
		WebElement seltag = driver.findElement(By.id("d2"));
		Select s=new Select(seltag);
		System.out.println(s.isMultiple());
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("v1");
		s.selectByVisibleText("MISAL PAV");
		s.deselectByIndex(4);
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
