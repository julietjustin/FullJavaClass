package excelread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcfelReadWithLoop {
	static XSSFSheet sheet;
	public static Row row;
	public static XSSFRow rows;
	
	public ExcfelReadWithLoop() throws IOException {
		//C:\\Users\\HP\\Desktop\\julietjavaworkspace\\testdata.xlsx
		File path=new File("C:\\\\Users\\\\HP\\\\Documents\\\\New folder\\\\JavaTest.xlsx");
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		sheet = workbook.getSheet("Sheet1");
		rows = sheet.getRow(0);
	}
	public String ReadExcel(int i,int j) {
		Row row=sheet.getRow(i);
		Cell cell=row.getCell(j);
		CellType type=cell.getCellType();
		switch(type) {
		case NUMERIC://String.valueOf() is used to get integer value in string return type
			return String.valueOf(cell.getNumericCellValue());
		case STRING:
			return cell.getStringCellValue();
		}
		return null;
	
	}
	public static int getRowSize() {
		return sheet.getLastRowNum()+1;
	}
	public static int getColumnSize() {
		//System.out.println( "Column size Inside Method  "+rows.getLastCellNum());
		return rows.getLastCellNum();
	}

	public static void main(String[] args) throws IOException {
		ExcfelReadWithLoop obj=new ExcfelReadWithLoop();
		for(int i=0;i<getRowSize();i++) {
			for(int j=0;j<obj.getColumnSize();j++) {
				String value= obj.ReadExcel(i, j);
				System.out.println(value);
			}
		}
				

	}

}
