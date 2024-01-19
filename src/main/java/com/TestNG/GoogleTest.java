package com.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "H:/Softwares/Selenium/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 1)
	public void titleValidation() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority = 2)
	public void signinButtonValidation() {
		
		boolean b = driver.findElement(By.xpath("//*[@id='gb']/div/div[2]/a/span")).isDisplayed();
		
	}
	
	
	@Test(priority = 3)
	public void tit1leValidation() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).isDisplayed();
	
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}

