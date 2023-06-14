package com.id.bd;

import org.testng.annotations.Test;

public class FirstAutomaion extends BaseDriver{
	@Test
	public void firstTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://novelhi.com/");
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
	}

}
