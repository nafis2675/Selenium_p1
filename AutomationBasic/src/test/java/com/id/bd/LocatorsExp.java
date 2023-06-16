package com.id.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExp extends BaseDriver{
	
	@Test
	public void testLocators() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us/en");
		Thread.sleep(2000);
		
//		By ID
//		WebElement bus = driver.findElement(By.id("purpose"));
//		bus.click();
//		Thread.sleep(3000);
		
//		By Name
//		WebElement bus = driver.findElement(By.name("city"));
//		bus.click();
//		Thread.sleep(3000);
		
//		By Link
//		WebElement bus = driver.findElement(By.linkText("Train"));
//		bus.click();
//		Thread.sleep(3000);
		
//		WebElement bus = driver.findElement(By.className("fnt-normal"));
//		bus.click();
//		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("test@nomail.com");
		Thread.sleep(3000);
	}

}
