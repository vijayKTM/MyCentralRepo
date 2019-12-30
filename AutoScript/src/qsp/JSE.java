package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com");
		
		WebElement brandsOfCraftsVilla = driver.findElement(By.xpath("//strong[contains(text(),'Wings')]"));
		Point loc = brandsOfCraftsVilla.getLocation();
		int x = loc.getX();
		int y=loc.getY();
		System.out.println("x axis "+x);
		System.out.println("y axis "+y);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("scrollBy(0,"+y+")");
		
		
		
		
	}
}
