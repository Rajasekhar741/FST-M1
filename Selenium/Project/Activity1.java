package selenium.Assignment;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	BusinessLogic bl = new BusinessLogic();

	
	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");	
	}
	
	
	@Test
	public void titleAndTextOfwebsite(){
			
	String actualTitle = bl.driver.getTitle();
	String expectedTitle = "SuiteCRM";
		System.out.println("Verify title must be SuiteCRM "+ actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle,"Passed");
	}	
	
	
	@AfterTest
	public void teardown() {
		
		bl.driver.quit();
	}
	}

