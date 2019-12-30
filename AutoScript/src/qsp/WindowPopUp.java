package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopUp {
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	
	public static void main(String[] args) throws AWTException, IOException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		
		File f=new File("./TestData/auto.exe");
		String apath = f.getAbsolutePath();
		Runtime.getRuntime().exec(apath);
		
	}

}
