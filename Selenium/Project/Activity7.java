package selenium.Assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {

	
	BusinessLogic bl = new BusinessLogic();

	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");			
		
	}
	
	
	@Test
	public void mobileNumberinLeads(){
	
		bl.login("admin","pa$$w0rd");
		String sales = "//span/a[contains(text(),'Sales')]";
		String leads = "//span/a[contains(text(),'Sales')]/..//li/a[contains(text(),'Leads')]";
		bl.visiblityWait(10, sales);
		boolean activitieMenu = bl.element(sales).isDisplayed();
		Assert.assertTrue(activitieMenu, "Homepage Displayed");
	
		bl.mouseHoverSubMenuClick(sales,leads);
	
		String addInfo = "//span[@title='Additional Details']";
		bl.visiblityWait(10, addInfo);
		bl.webElementClick(addInfo);
		
		
		String phoneNumber = "//div[contains(text(),'Additional Details')]/../../button/../../div[2]/span";
		bl.visiblityWait(10, phoneNumber);
		
		String mobileNumber = bl.driver.findElement(By.xpath(phoneNumber)).getText();
		System.out.println(mobileNumber);
		
	}	
	
	
	@AfterTest
	public void teardown() {

		bl.driver.quit();
	}
	

	
	
	
}
