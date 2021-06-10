package com.project.test.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithReflection {

	@Test(dataProvider = "getData1")
	private void test1(String s) {
		System.out.println(s);
	}
	
	@Test(dataProvider = "getData1")
	private void test2(Employee e) {
		System.out.println("Name: " +e.getName() + " id: "+e.getId());
	}
	
	
	//To avoid 2 data provider we can use reflection API's
	
	@DataProvider()
	private Object[] getData1(Method m) {
		if(m.getName().equalsIgnoreCase("test2")) {
			return new Employee[]{
					new Employee("abhi", 1),
					new Employee("raj", 2)};
		}else if(m.getName().equalsIgnoreCase("test1")) {
			return new Object[] {
					"manish","patidar","automation"
			};
		}
		return null;
	}

}
