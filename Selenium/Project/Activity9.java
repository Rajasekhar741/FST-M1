package selenium.Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	
	
	BusinessLogic bl = new BusinessLogic();

	@BeforeMethod
	public void browserinit() {
		bl.chromebrowserInit("https://alchemy.hguy.co/crm/");	
		bl.login("admin","pa$$w0rd");
		
		
	}
	
	
	@Test
	public void userAndNames(){
	
		String sales = "//span/a[contains(text(),'Sales')]";
		String leads = "//span/a[contains(text(),'Sales')]/..//li/a[contains(text(),'Leads')]";
		bl.visiblityWait(10, sales);
		boolean activitieMenu = bl.element(sales).isDisplayed();
		Assert.assertTrue(activitieMenu, "Homepage Displayed");
		
		bl.mouseHoverSubMenuClick(sales,leads);
		bl.visiblityWait(10, "//td[@field='name']//a");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> users = new ArrayList<String>();
	    List<WebElement> userName = bl.driver.findElements(By.xpath("//td[@field='name']//a"));
	    List<WebElement> user = bl.driver.findElements(By.xpath("//td[@field='assigned_user_name']//a"));
	    
	    if(userName.size()>0) {
	    	for (int j = 0; j < 10; j++) {		
	    		names.add(userName.get(j).getText());
	    		users.add(user.get(j).getText());
	    		
	    		System.out.println("UserName and User: " + userName.get(j).getText() + " : " + user.get(j).getText());
	    		System.out.println();
		}}
	    
//	    System.out.println(names);
//	    System.out.println(users);
	    		
	}	
	
	
	@AfterTest
	public void teardown() {

		bl.driver.quit();
	}

	
	

	
	
	

}
