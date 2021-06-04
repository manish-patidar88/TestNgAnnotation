package com.project.test.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest_ParallelExecution {
	
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.out.println("Inilization the Chrome driver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	}
	
	@Test()
	@Parameters("URL")
	public void chromeTestMethod(String url) {
		System.out.println("The thread id of chrome is "+ Thread.currentThread().getId());
		driver.get(url);
		System.out.println(driver.getTitle());
	}
		
	@AfterTest
	public void afterTest() {
		System.out.println("Closing the driver");
		driver.close();
	}
	
}
