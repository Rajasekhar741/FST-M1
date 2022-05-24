package selenium.Assignment;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	
	BusinessLogic bl = new BusinessLogic();

	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");	
	}
	
	
	@Test
	public void titleURL(){
			
	    String value =	bl.element("//div[@class='companylogo']/img").getAttribute("src");
		System.out.println(value);
		
	}	
	
	
	@AfterTest
	public void teardown() {
		
		bl.driver.quit();
	}

	
	
	
	
	
	
	
	
	
	

}
