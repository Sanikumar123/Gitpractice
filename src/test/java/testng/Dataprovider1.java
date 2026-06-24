package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {

//data1



	@Test(dataProvider = "Data", enabled=false, dataProviderClass=ExcelRead.class)
	public void addTwoNumber(int a, int b) {
		System.out.println(a + b);
	}
	
	@Test(dataProvider = "ExcelMapData", dataProviderClass=ExcelRead.class)
	public void printExcleData(HashMap<String, String> map) {
		
		System.out.println(map.get("Username"));
		System.out.println(map.get("Password"));
		
		
	}

}
