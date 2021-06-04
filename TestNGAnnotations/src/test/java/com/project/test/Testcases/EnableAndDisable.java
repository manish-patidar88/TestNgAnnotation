package com.project.test.Testcases;

import org.testng.annotations.Test;

public class EnableAndDisable {

	@Test(enabled = true,description = "Test method 1 is executed using testNG")
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test(enabled = false,description = "Test method 2 is executed using testNG")
	public void test2() {
		System.out.println("test2 executed");
	}
}
