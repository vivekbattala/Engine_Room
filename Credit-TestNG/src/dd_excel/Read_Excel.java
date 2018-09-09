package dd_excel;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;


import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;


import org.testng.annotations.AfterTest;

public class Read_Excel {
	 @BeforeTest
	  public void beforeTest() {
	  }
	
  @Test
  public void f() throws Exception {
	  
	  FileInputStream fi=new FileInputStream("C:\\Users\\Vik\\Desktop\\test_data1.xls");
	  Workbook wb=Workbook.getWorkbook(fi);
	  Sheet s=wb.getSheet("Sheet1");
	  
	 // System.out.println(s.getCell(1,2).getContents());
	  
	  for (int i = 0; i < s.getRows(); i++) {
		  System.out.println(" ");
		  for (int j = 0; j < s.getColumns(); j++) {
			  System.out.print(s.getCell(j,i).getContents()+"|");
			
		}
		
	}
  }
 

  @AfterTest
  public void afterTest() {
  }

}
