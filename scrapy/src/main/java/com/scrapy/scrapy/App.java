package com.scrapy.scrapy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	
    	DesiredCapabilities caps = new DesiredCapabilities();
    	caps.setJavascriptEnabled(true);                  
    	caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
    	                        "C:\\Users\\Admin\\Downloads\\ph\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe"
    	                    );
    	WebDriver driver = new  PhantomJSDriver(caps);
    	
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	 driver.get("https://www.instagram.com/p/BuO0mBuhWLe");
    	  
    	 WebElement e =  driver.findElement(By.className("zV_Nj"));
    	
    	 System.out.println(e.getText());
    }
}
