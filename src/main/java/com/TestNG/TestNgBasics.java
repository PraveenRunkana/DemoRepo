package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite
	public void setUp() {
		
		System.out.println("Test Parameters");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Open Application");
		
	}
	
	
	@BeforeTest
	public void login() {
		System.out.println("Login");
		
	}
	
	@Test
	public void testCase1() {
		System.out.println("Test Case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test Case2");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Logout AFter Test");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		
		System.out.println("Close browser");
	}
	
	
	@AfterSuite
	public void testReport() {
		System.out.println("Generate Report");
	}
	
}

