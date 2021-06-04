package com.project.test.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestCase {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Test1()
	{
		System.out.println("Test retry");
		Assert.fail();
	}

	@Test
	public void Test2()
	{
		System.out.println("Test2 passed");
		Assert.assertEquals(true, true);
	}
}
