package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase01 {
	@Test
	public void ktmTestCase()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ktm.com/en-in.html");
		
		
		Assert.assertEquals(driver.getTitle(), "KTM - READY TO RACE", "KTM Page is Not Displayed.."); 
		Reporter.log("KTM Page is  Displayed..", true);
		
		driver.close();
	}
	
}
