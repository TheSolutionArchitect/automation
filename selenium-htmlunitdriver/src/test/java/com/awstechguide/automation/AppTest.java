package com.awstechguide.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String URL ="https://www.amazon.ca";
	String URL2 ="https://awstechguide.com/";
	public HtmlUnitDriver driver;
	
	@Test
	   public void testURL() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(URL);
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surface pro 7");
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   }
	
	@Test
	public void testURL2() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(URL2);
		   List<WebElement> el= driver.findElements(By.xpath("//*[text()[contains(.,'AWS Tech')]]"));
		   System.out.println("No of existance: "+el.size());
		   driver.findElements(By.partialLinkText("Tech"));
	   }
	
	
}
