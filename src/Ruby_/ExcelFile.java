package Ruby_;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import Utils.CommonMethods;
//
//public class ExcelFile extends CommonMethods{
//	private static Workbook book;
//	private static Sheet sheet;
//	public static void openExcel(String filePath, String sheetName) {
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			book = new XSSFWorkbook(fis);
//			sheet = book.getSheet(sheetName);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	public static int rowCount() {
//		return sheet.getPhysicalNumberOfRows();
//	}
//	public static int colCount() {
//		return sheet.getRow(0).getLastCellNum();
//	}
//	public static String getCellData(int row, int col) {
//		return sheet.getRow(row).getCell(col).toString();
//	}
//	
//	
//	public static Object [][] excelToArray(String filePath,String sheetName){
//		
//		openExcel(filePath,sheetName);
//		
//		Object [][] data = new Object[rowCount()-1][colCount()];
//		for (int i = 1; i < rowCount(); i++) {
//			for (int j = 0; j < colCount(); j++) {
//				data[i-1][j] = getCellData(i,j);
//			}
//			
//		}
//		
//		return data;
//	}
//}
