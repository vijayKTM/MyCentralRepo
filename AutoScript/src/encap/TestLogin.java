package encap;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		Workbook wk = WorkbookFactory.create(new File("./TestData/TestData.xlsx"));
		String username = wk.getSheet("Demo").getRow(1).getCell(0).toString();
		String password = wk.getSheet("Demo").getRow(1).getCell(1).toString();
		LoginPOMPage l=new LoginPOMPage(driver);
		l.getUsername(username);
		l.getPassword(password);
		l.clickLogin();
		
		

	}

}
