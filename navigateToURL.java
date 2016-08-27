package webDriver_try1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class navigateToURL  extends start {
	
	@Test
	public void search() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Manish\\workspace\\webDriver_try1\\src\\webDriver_try1\\searchprop.properties");
		prop.load(fis);		
		
		Driver.get(prop.getProperty("URL"));
		/*List<WebElement> ls = Driver.findElements(By.tagName("a"));
		for(WebElement element:ls)
			System.out.println(element.getText());
		*/
		WebElement searchBox = Driver.findElement(By.name("q"));
		searchBox.sendKeys(prop.getProperty("text"));
		
		searchBox.submit();
		Assert.assertTrue(Driver.findElement(By.id("logo")).isDisplayed());
		
	}

}
