package testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assert1 {

	@Test(enabled = false)
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Google", actualTitle);
		System.out.println("Home page of google");
		
		WebElement gooImg = driver.findElement(By.xpath("//img[@alt='Google']"));
		boolean isImgDis = gooImg.isDisplayed();
		Assert.assertTrue(isImgDis);
	}
	
	@Test
	public void testZB() {
		int a=10;
		int b=10;
		int sum=a+b;
		int mult=a*b;
		int div=a/b;
		int sub=a-b;
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(sum, 20);
		System.out.println("s1");
		s.assertEquals(mult, 100);
		System.out.println("s2");
		s.assertEquals(div, 1);
		System.out.println("s3");
		s.assertEquals(sub, 0);
		System.out.println("s4");
		s.assertAll();
		s.fail();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
