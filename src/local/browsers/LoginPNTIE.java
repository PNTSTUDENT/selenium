package local.browsers;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginPNTIE {

	InternetExplorerDriver driver;
    @Before  
    
    public void setup(){
    	//
    	System.setProperty("webdriver.ie.driver", "C:\\Users\\Beauty.Acharjee\\Downloads\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");
    	driver=new InternetExplorerDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }
	@Test
	public void LoginToPNT(){
		driver.get("http://www.peoplentech.com/forum/");
        System.out.println(driver.findElements(By.name("user")).size());
        driver.findElements(By.name("user")).get(1).sendKeys("qtptestuser1");
		driver.findElements(By.name("passwrd")).get(1).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id='frmLogin']/div/div[3]/p[1]/input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='button_logout']/a/span")).isDisplayed());
		
		
		
	}
    
   @After
   public void tearDown(){
	   driver.quit();
	   

   }
   
}
