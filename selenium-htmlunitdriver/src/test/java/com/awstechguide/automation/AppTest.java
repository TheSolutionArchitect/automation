package com.awstechguide.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String URL ="https://www.amazon.ca";
	public HtmlUnitDriver driver;
	
	@Test
	   public void testURL() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(URL);
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surface pro 7");
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   }
}
