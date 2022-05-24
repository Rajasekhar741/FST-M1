package selenium.Assignment;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	
	
BusinessLogic bl = new BusinessLogic();

	
	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");	
	}
	
	
	@Test
	public void copyrightText(){
			
	String copyright = bl.element("//div[@class='p_login_bottom']/a[1]").getText();
		System.out.println("Verify title must be SuiteCRM "+ copyright);
		
	}	
	
	
	@AfterTest
	public void teardown() {
		
		bl.driver.quit();
	}
	
	
	
}
