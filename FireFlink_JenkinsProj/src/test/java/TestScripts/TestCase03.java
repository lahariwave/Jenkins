package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase03 {
	@Test
	public void ktmTestCase()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yamaha-motor-india.com/");
		
		
		Assert.assertEquals(driver.getTitle(), "Yezdi Motorcycle Official Website | Yezdi Motorcycles India", "Yezdi Motorcycle Page is Not Displayed.."); 
		Reporter.log("Yezdi Motorcycle Page is  Displayed..", true);
		
		driver.close();
	}
	
}
