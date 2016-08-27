package webDriver_try1;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class start {
	
	public WebDriver Driver;
		
	@BeforeMethod
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chromedriver.exe");
		Driver = new ChromeDriver();
		//Driver.get("http://www.google.co.in");
	}
	@AfterMethod
	public void close(){
		Driver.close();
		Driver.quit();
	}
}
