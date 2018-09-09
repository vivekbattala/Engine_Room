package dd_excel;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.JxlWriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() throws IOException, JxlWriteException, WriteException {
	  
	  FileOutputStream fo=new FileOutputStream("C:\\Users\\Vik\\Desktop\\test_data1.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(fo);
	  WritableSheet ws= wb.getSheet("Sheet1");
	  Label writeLabel=new Label(5,0,"Status");
	  
	  ws.addCell(writeLabel);
	  
	  wb.write();
	  wb.close();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
