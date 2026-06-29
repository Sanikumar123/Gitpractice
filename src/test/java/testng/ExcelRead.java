package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelRead {
	//data2
	//excel
	//excel 2
	//feature
    //feature 2
	
	@DataProvider(name = "ExcelData")
	public Object[][] getExcelData() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\sanim\\Downloads\\UserDetails.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fin);

		XSSFSheet sheet = wb.getSheetAt(0);

		int rownum = sheet.getLastRowNum();

		XSSFRow row = sheet.getRow(0);
		int colnum = row.getLastCellNum();
		String data[][] = new String[rownum][colnum];
		for(int i=1;i<rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				data[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
	}
	
	
	@DataProvider(name = "ExcelMapData")
	public Object[][] getExcelMapData() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\sanim\\Downloads\\UserDetails.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fin);

		XSSFSheet sheet = wb.getSheetAt(0);

		int rownum = sheet.getLastRowNum();

		XSSFRow row = sheet.getRow(0);
		int colnum = row.getLastCellNum();
		Object data[][] = new Object[rownum][1];
		for(int i=1;i<=rownum;i++)
		{
			HashMap<String,String> map = new HashMap<String,String>();
			for(int j=0;j<colnum;j++)
			{
				String key= sheet.getRow(0).getCell(j).getStringCellValue();
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				
				map.put(key, value);
				
			}
			//System.out.println(map);
			
			data[i-1][0]=map;
			//System.out.println("Data"+data[i-1][0]);
			
		}
		
		return data;
	}
	
	
	@DataProvider(name = "Data")
	public Object[][] getData(Method m) {
		Object[][] data= null;
		
		if(m.getName().equalsIgnoreCase("addTwoNumber"))
		{
			data =  new Object[][] {

				{ 2, 3 }, { 4, 5 }

		};
		}
		return data;
	}

}
