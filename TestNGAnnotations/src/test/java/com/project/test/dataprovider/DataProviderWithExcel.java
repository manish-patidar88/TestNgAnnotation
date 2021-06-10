package com.project.test.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	@Test(dataProvider = "getData")
	private void empData(Map<String,String> map) {
		System.out.println(map.get("id"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("firstname"));
	}
	
	
	@DataProvider
	public Object[] getData() throws IOException {
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//project//test//testdata//empData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheet("testdata");
				
		int rownum = sheet.getLastRowNum();
		int colnum = sheet.getRow(0).getLastCellNum();
		
		Object[] data = new Object[rownum];
		Map<String,String> map = new HashMap<>();
		for(int i=1;i<=rownum;i++) {
			map = new HashMap<>();
			for(int j=0;j<colnum;j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
			}
			data[i-1]=map;
			System.out.println(map);
		}	
		
		return data;		
	}

}
