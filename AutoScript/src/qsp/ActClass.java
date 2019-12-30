package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement eee = driver.findElement(By.xpath("//span[text()='Electronics']"));		
		
		Actions act=new Actions(driver);
		act.moveToElement(eee).perform();
		Thread.sleep(2000);
		
		WebElement mi = driver.findElement(By.xpath("(//a[text()='Mi'])[1]"));
		
		act.contextClick(mi).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		
		
		
		
		
		
		
		
		
//		driver.get("file:///C:/Users/QSP/Downloads/drag&drop.html");
//		WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
//		WebElement dest = driver.findElement(By.xpath("//p[contains(text(),'Drop')]"));
//		
//		Actions a=new Actions(driver);
//		a.dragAndDrop(src, dest).perform();

		
//		driver.get("file:///C:/Users/QSP/Downloads/doubliclick.html");
//		
//		WebElement var = driver.findElement(By.xpath("//button[contains(text(),'here')]"));
//		
//		Actions act=new Actions(driver);
//		act.doubleClick(var).perform();
		
	}

}
