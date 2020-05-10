package com.awstechguide.automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	private WebDriver driver;
	String URL ="http://google.com";
	String URL2 ="http://amazon.ca";
	
	@BeforeClass
	public void testSetup() {
		//download driver from https://chromedriver.chromium.org/downloads
		System.setProperty("webdriver.chrome.driver","D:\\test\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
   @Test
   public void testURL() {
	driver.navigate().to(URL);
	String title= driver.getTitle();
	Assert.assertEquals(title, "Google");
	System.out.println("title:"+title);
   }
   
   @Test
   public void testURL2() {
	   driver.navigate().to(URL2);
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surface pro 7");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
   }
   
   @AfterClass
   public void tearDown() {
	   driver.quit();
   }
   
}
