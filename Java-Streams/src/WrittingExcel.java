import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingExcel {

	public static void main(String[] args) throws Throwable {
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet1 = workBook.createSheet("First_sheet");
		/*
		 * XSSFSheet sheet2 = workBook.createSheet("Second_sheet");
		 * 
		 * XSSFRow row_0 = sheet1.createRow(0); XSSFRow row_1 = sheet1.createRow(1);
		 * XSSFRow row_2 = sheet1.createRow(2);
		 * 
		 * XSSFCell CellA = row_0.createCell(0); XSSFCell CellB = row_0.createCell(1);
		 * XSSFCell CellC = row_0.createCell(2); XSSFCell CellD = row_0.createCell(3);
		 * 
		 * CellA.setCellValue("text");
		 */
		for (int i=0;i<10;i++) {
			Row row = sheet1.createRow(i);
			for(int j=0;j<10;j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		File f = new File(System.getProperty("user.dir")+"/files/new.xls");
		
		FileOutputStream fo = new FileOutputStream(f);
		workBook.write(fo);
		fo.close();
		workBook.close();
		System.out.println("Excel file was written");

	}

}
