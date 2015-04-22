package local.browsers;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPNTChrome {

	ChromeDriver driver;
    @Before  
    
    public void setup(){
    	
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beauty.Acharjee\\Downloads\\chromedriver_win32\\chromedriver.exe");
    		
   
    	driver=new ChromeDriver();
    	//http://chromedriver.storage.googleapis.com/index.html
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beauty.Acharjee\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
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

	   

  
   
   
   
   
