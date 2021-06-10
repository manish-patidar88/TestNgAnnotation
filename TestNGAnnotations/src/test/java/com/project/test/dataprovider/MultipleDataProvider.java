package com.project.test.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataProvider {

	@DataProvider
	private Employee[] getDataEmp() {
	
		return new Employee[]{
				new Employee("abhi", 1),
				new Employee("raj", 2),
				new Employee("ram", 3)}; 
	}

	@DataProvider
	private Object[] getData() {
		return new Object[] {
				"manish","patidar","automation"
		};
	}
	
	@Test(dataProvider = "getData")
	private void test1(String s) {
		System.out.println(s);
	}
	
	@Test(dataProvider = "getDataEmp")
	private void test2(Employee e) {
		System.out.println("Name: " +e.getName() + " id: "+e.getId());
	}
		
}
