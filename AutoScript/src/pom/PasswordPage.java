package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {
@FindBy(xpath = "//input[@name='password']")
private WebElement pwTB;

@FindBy(xpath = "//span[text()='Next']")
private WebElement pnextBtn;

public PasswordPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void getPassword(String pw)
{
	pwTB.sendKeys(pw);
	pnextBtn.click();
}







}
