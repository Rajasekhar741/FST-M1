package selenium.Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	
BusinessLogic bl = new BusinessLogic();

	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");			
		
	}
	
	
	@Test
	public void getColor(){
		
		bl.login("admin","pa$$w0rd");
		bl.visiblityWait(10, "//a[contains(text(), 'SUITECRM DASHBOARD')]");
		boolean homepage = bl.element("//a[contains(text(), 'SUITECRM DASHBOARD')]").isDisplayed();
		Assert.assertTrue(homepage, "Homepage Displayed");

		
		WebElement navbar  = bl.driver.findElement(By.cssSelector("div#toolbar.desktop-toolbar"));
		System.out.println(navbar.getCssValue("background"));
		System.out.println(navbar.getCssValue("background-color"));
		System.out.println(navbar.getCssValue("color"));


		
		
	}	
	
	
	
	@AfterTest
	public void teardown() {

		bl.driver.quit();
	}
	
	
	

}
