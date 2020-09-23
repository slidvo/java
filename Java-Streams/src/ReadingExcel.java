import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws Throwable {
		File f = new File(System.getProperty("user.dir")+"/files/new.xls");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet_0 = wb.getSheetAt(0);
//		Row row_0 = sheet_0.getRow(0);
//		
//		Cell cell_0 = row_0.getCell(0);
//		Cell cell_1 = row_0.getCell(1);
//		Cell cell_2 = row_0.getCell(2);
//		
//		System.out.println("cell[0] is " +cell_0);
//		System.out.println("cell[1] is " +cell_1);
//		System.out.println("cell[2] is " +cell_2);
//		
		for(Row row : sheet_0) {
			for(Cell cell : row) {
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case BLANK:
					System.out.print("Blank cell"+"\t");
					break;
				case BOOLEAN:
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				case NUMERIC:
					System.out.print((int)cell.getNumericCellValue()+"\t");
					break;
				case _NONE:
					break;
				default:
					break;
				}
			}
			System.out.println();
		}
		fi.close();

	}

}
