package com.project.test.group;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestStructure {

	@BeforeSuite()
	public void loadDataFromXl() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeClass
	public void loadDataFromDB() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
}


