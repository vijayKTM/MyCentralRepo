package testngg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test
  public void f() 
  {
	  Reporter.log("Execution of testMethod ",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Execution of beforeMethod",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Execution of afterMethod",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Execution of beforclass",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("Execution of afterclass",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Execution of beforetest",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("Execution of afterTEst",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Execution of before suite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("Execution of after Suite",true);
  }

}
