package com.project.test.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestAnnotation2 {
	
	@org.testng.annotations.Test
	public void Test() {
		
		System.out.println("First method of class annotation2");
		Assert.assertTrue(true);
	}
	
	@org.testng.annotations.Test
	public void Test1() {
		System.out.println("Second method of class annotation2");
		Assert.assertTrue(false);
	}
	
	

}
