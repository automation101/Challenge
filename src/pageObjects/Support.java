package pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import utility.Constant;

public class Support {
	//WebDriver driver = new ChromeDriver();	
	protected WebDriver driver = null;
@BeforeClass

public void beforeclass() {
	  
	  
	System.setProperty("webdriver.chrome.driver", Constant.driverPath);	
	 driver = new ChromeDriver();
		
	 driver.manage().window().maximize();
	  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
     driver.get(utility.Constant.baseUrl);
}


public void waitForLoad() {
	
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

public void enterText(String id, String text) {
	WebElement element_enter = driver.findElement(By.id(id));
	element_enter.sendKeys(text);
	
}
public void click(String id) {
		
	WebElement element = driver.findElement(By.id(id));
		element.click();
	
}

public void clearField(String id) {
	
	WebElement element = driver.findElement(By.id(id));
		element.clear();
		
		
	
}
public String getTextByid(String moreInfo) {
	
	WebElement element = driver.findElement(By.xpath(Constant.moreInfo));
			
	return element.getText();

	
}


	public String getTextByxpath(String value) {
			
		WebElement element = driver.findElement(By.xpath(value));
				
		return element.getText();
	}
	
		public boolean verifyByxpath(String xpath) {
			
			WebElement element = driver.findElement(By.xpath(xpath));
					
			return element.isEnabled();
			
}
		
}

