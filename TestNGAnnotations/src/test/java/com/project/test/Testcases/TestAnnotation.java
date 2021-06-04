package com.project.test.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestAnnotation {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("After Methos");
	}

	@Test
	public void Test() {
		System.out.println("Test first method");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test second method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

}
