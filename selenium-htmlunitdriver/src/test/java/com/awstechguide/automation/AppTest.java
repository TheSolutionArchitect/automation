package com.awstechguide.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String URL ="https://www.amazon.ca";
	String URL2 ="https://awstechguide.com/";
	public HtmlUnitDriver driver;
	public WebDriverWait wait;
	
	@Test(priority = 0)
	   public void testURL() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(URL);
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surface pro 7");
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   }
	
	@Test(priority = 1)
	public void testURL2() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(URL2);
		   List<WebElement> el= driver.findElements(By.xpath("//*[text()[contains(.,'AWS Tech')]]"));
		   System.out.println("No of existance: "+el.size());
		   driver.findElements(By.partialLinkText("Tech"));
	   }
	
    public void test3()  {
		driver = new HtmlUnitDriver();
		wait = new WebDriverWait(driver, 5);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Som Speaks");;
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();;
		System.out.println("getTitle*********"+getTitle);
		driver.quit();
    }
	

    public void test4()  {
		driver = new HtmlUnitDriver();
		wait = new WebDriverWait(driver, 5);
		driver.get(URL2);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "AWS Tech Guide");
		System.out.println("getTitle*********"+getTitle);
		driver.quit();
	}
	
	
}
