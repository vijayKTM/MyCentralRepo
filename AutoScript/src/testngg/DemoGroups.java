package testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoGroups {
	
	
	@Test(groups = "smk")
	public void testA()
	{
		Reporter.log("Smoke Testing only",true);
	}
	
	@Test(groups = {"smk","fun"})
	public void testFG()
	{
		Reporter.log("Smoke Testing or Functional Testing",true);
	}
	
	@Test(groups = "reg")
	public void testZ()
	{
		Reporter.log("Regression Testing only",true);
	}
	
	
	@Test(groups = {"int","reg"})
	public void testD()
	{
		Reporter.log("Integration or regression Testing",true);
	}
	
	
	

}
