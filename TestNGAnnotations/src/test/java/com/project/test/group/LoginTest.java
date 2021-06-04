package com.project.test.group;

import org.testng.Assert;
import org.testng.annotations.Test;

class LoginTest extends TestStructure{
	
	@Test(groups = "SmokeLogin")
	public void test() {
		Assert.assertTrue(false);
		System.out.println("Login test Pass groups = SmokeLogin");
	}
}