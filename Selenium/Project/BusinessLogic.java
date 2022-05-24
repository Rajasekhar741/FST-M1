package selenium.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessLogic {

	WebDriver driver;
	
	
	public void chromebrowserInit(String url) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public WebElement element(String xpath) {
		
		return driver.findElement(By.xpath(xpath));
		
	}
	
	public void login(String username, String password) {
		
		WebElement user = element("//input[@id='user_name']");
		WebElement pwd = element("//input[@id='username_password']");
		WebElement login = element("//input[@id='bigbutton']");
		
		user.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		
	}
	
	public void visiblityWait(int time, String xpath) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void mouseHoverSubMenuClick(String menuXpath, String subMenuXpath) {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(menuXpath))).perform();
		action.moveToElement(driver.findElement(By.xpath(subMenuXpath))).click().perform();	
		
		
	}	
	
	
	public void webElementClick(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();;
	}
	
	
}
