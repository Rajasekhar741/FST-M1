package selenium.Assignment;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

BusinessLogic bl = new BusinessLogic();

	
	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");	
		
		
	}
	
	
	@Test
	public void login(){
		
		bl.login("admin","pa$$w0rd");
		bl.visiblityWait(10, "//a[contains(text(), 'SUITECRM DASHBOARD')]");
		boolean homepage = bl.element("//a[contains(text(), 'SUITECRM DASHBOARD')]").isDisplayed();
		Assert.assertTrue(homepage, "Homepage Displayed");
	
		
	}	
	
	
	@AfterTest
	public void teardown() {
		
		bl.driver.quit();
	}
	
	
	
	
	
	
}
