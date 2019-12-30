package testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	
	
	@Test(invocationCount = 10)
	public void testModA()
	{
				Reporter.log("testing a Mod",true);
	}
	
	@Test(enabled=false)
	public void testModB()
	{
				Reporter.log("testing b Mod",true);
	}

}
