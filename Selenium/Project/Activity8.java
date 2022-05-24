package selenium.Assignment;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {

	BusinessLogic bl = new BusinessLogic();

	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");	
		bl.login("admin","pa$$w0rd");
		
		
	}
	
	
	@Test
	public void printOddNamesInTable(){
	
		String sales = "//span/a[contains(text(),'Sales')]";
		String account = "//span/a[contains(text(),'Sales')]/..//li/a[contains(text(),'Account')]";
		bl.visiblityWait(10, sales);
		boolean activitieMenu = bl.element(sales).isDisplayed();
		Assert.assertTrue(activitieMenu, "Homepage Displayed");
		
		bl.mouseHoverSubMenuClick(sales,account);
		bl.visiblityWait(10, "//td[@field='name']//a");
		
		ArrayList<String> names = new ArrayList<String>();
	    List<WebElement> list = bl.driver.findElements(By.xpath("//td[@field='name']//a"));
	 
	    if(list.size()>0 && list.size()>9) {
	    	for (int j = 0; j < 9; j++) {		
	    		names.add(list.get(j).getText());
	    		j+=1;   		
		}}
	    
	    System.out.println(names);
	    
			
		
		
	}	
	
	
	@AfterTest
	public void teardown() {

		bl.driver.quit();
	}

	
	
	
	
}
