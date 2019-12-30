package testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() 
  {
//	  System.out.println("Welcome to Qsp");
	  Reporter.log("Welcome to Qsp");
	  Reporter.log("Get Lost",true);
  }
}
