package com.project.test.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNG {
	
	
	@DataProvider(name="data")
	public Object[][] DataProviderTest() {
		Object[][] obj = new Object[3][2];
		obj[0][0]="manish.patidar@gmail.com";
		obj[0][1]="Test@123";
		
		obj[1][0]="paul.david@gmail.com";
		obj[1][1]="Test@1234";
		
		obj[2][0]="anton.desuza@gmail.com";
		obj[2][1]="Test@12345";
		return obj;
		
	}
	
	@Test(dataProvider ="data")
	public void test(String username,String password) {
		System.out.println(username+ " : "+ password);
	}

}
