package readingdatafromexcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {
 public static void main(String[] args) throws IOException {
	FileInputStream obj=new FileInputStream(System.getProperty("user.dir")+"/target/sheet.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(obj);
	XSSFSheet sheet=workbook.getSheet("names");
	int rows=sheet.getLastRowNum();
	Map<String, String> data=new LinkedHashMap<String, String>();
	System.out.println(rows);
	for(int r=0;r<=rows;r++) {
		String key=sheet.getRow(r).getCell(0).getStringCellValue();
		String value=sheet.getRow(r).getCell(1).getStringCellValue();
		data.put(key, value);
		
	}
	for(Map.Entry<String, String>      entry: data.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
}
	}


