package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		Set<String> whs = driver.getWindowHandles();
		Iterator<String> it = whs.iterator();
		
		String parent = it.next();
		String child1 = it.next();
		String child2 = it.next();
		
		driver.switchTo().window(child1).close();
		
		driver.switchTo().window(child2).close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[contains(text(),'Job Alert')]")).click();
		
		Thread.sleep(6000);
		driver.quit();
		
		
		
		
		
	}
}
