package remote.browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LongintoPNTOnCloud {
	
	WebDriver driver;
    @Before  
    
    public void setup() throws MalformedURLException{
    	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
    	caps.setCapability("platform", "Windows 8");
    	caps.setCapability("version", "10.0");
    	driver= new RemoteWebDriver(new URL("http://peopleach:f6c7492e-1987-41d5-a559-7775dfb3ae49@ondemand.saucelabs.com:80/wd/hub"), caps);
    	
    	
    	
                
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }
	@Test
	public void LoginToPNT(){
		driver.get("http://www.peoplentech.com/forum/");

		driver.findElement(By.xpath("//*[@id='frmLogin']/div/div[3]/dl/dd[1]/input")).sendKeys("qtptestuser1");
		driver.findElement(By.xpath("//*[@id='frmLogin']/div/div[3]/dl/dd[2]/input")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id='frmLogin']/div/div[3]/p[1]/input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='button_logout']/a/span")).isDisplayed());
		
		
		
	}
    
   @After
   public void tearDown(){
	   driver.quit();
	   
	   
   }
   
   
   
   

}
