package com.project.test.group;

import org.testng.annotations.Test;

public class APITestCases1 {
	
	@Test(groups = "API", dependsOnGroups = {"SmokeLogin"})
	public void APITestCase1() {
		System.out.println("API: test1");
	}
	
	@Test(groups = "API",dependsOnGroups = {"SmokeLogin"})
	public void APISubTest1_0() {
		System.out.println("API: test-subtest1");
	}
	
	@Test(groups = "API")
	public void APISubTest1_2() {
		System.out.println("API: test-subtest2");
	}

}
