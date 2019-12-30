package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopUp {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.xpath("//input[@id='nqame2']")).sendKeys("idontknow");
		driver.findElement(By.id("dtDOB")).click();
		WebElement selMonth = driver.findElement(By.id("selMonth"));
		Select s1=new Select(selMonth);
		s1.selectByVisibleText("January");
		WebElement selYear = driver.findElement(By.id("selYear"));
		Select s2=new Select(selYear);
		s2.selectByVisibleText("2017");
	
		driver.findElement(By.linkText("7")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
