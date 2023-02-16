package excelread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	XSSFSheet sheet;
	public ExcelRead() throws IOException{
		File path=new File("C:\\Users\\HP\\Documents\\New folder\\JavaTest.xlsx");
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		sheet = workbook.getSheet("Sheet1");
	}
	public double ReadDataFromExcel(int i,int j) {
		Row row=sheet.getRow(i);
		Cell cell=row.getCell(j);
		//return cell.getStringCellValue();//to give string value
		return cell.getNumericCellValue();//to give integer value
		
	}

	public static void main(String[] args) throws IOException {
		ExcelRead obj=new ExcelRead();
		//String str = obj.ReadDataFromExcel(0,1);//need to give position of the value in the excel 
		double value = obj.ReadDataFromExcel(0,0);
		System.out.println(value);

	}

}


