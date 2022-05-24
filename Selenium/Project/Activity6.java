package selenium.Assignment;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	
	
	BusinessLogic bl = new BusinessLogic();

	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");			
		
	}
	
	
	@Test
	public void existAndClickable(){
	
		bl.login("admin","pa$$w0rd");
		bl.visiblityWait(10, "//a[contains(text(), 'SUITECRM DASHBOARD')]");
		boolean clickable = bl.element("//a[contains(text(),'Activities')]").isEnabled();
		boolean activitieMenu = bl.element("//a[contains(text(),'Activities')]").isDisplayed();
		Assert.assertTrue(activitieMenu, "Homepage Displayed");
		Assert.assertTrue(clickable, "Homepage Displayed");
		
	}	
	
	
	@AfterTest
	public void teardown() {

		bl.driver.quit();
	}
	
	
	
	

}
