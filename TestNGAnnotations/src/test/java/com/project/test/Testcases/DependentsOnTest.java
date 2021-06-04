package com.project.test.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentsOnTest {

	@Test(dependsOnMethods= {"openBrowser"})
	public void signIn() {		
		System.out.println("signIn to application");
		Assert.assertTrue(false);
	}
	
	@Test
	public void openBrowser() {
		System.out.println("Open browser");
	}
	
	@Test(dependsOnMethods= {"openBrowser","signIn"})
	public void closeBrowser() {
		System.out.println("close browser");
	}
}
