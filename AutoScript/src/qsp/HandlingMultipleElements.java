package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/demo.html");
		
		List<WebElement> chckBoxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = chckBoxs.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement we = chckBoxs.get(i);
			we.click();
		}
	}

}
