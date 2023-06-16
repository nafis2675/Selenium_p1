package com.id.bd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExp {
	
	
	@Test (priority = 0)
	public void firstTestMethode() {
		System.out.println("This is first Test");
	}
	
	@Test(priority = 1)
	public void secondTestMethode() {
		System.out.println("This is second Test");
	}
	
	@BeforeSuite
	public void beforeSuitTest() {
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void afterSuitTest() {
		System.out.println("This is After Suite");
	}
	
	@BeforeTest
	public void beforeTestMethode() {
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void afterTestMethode() {
		System.out.println("This is After Test");
	}
	
	@BeforeClass
	public void beforeClassMethode() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void afterClassMethode() {
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("This is After Method");
	}

}
