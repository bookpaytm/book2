package uitilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	
	
	
	
	XSSFWorkbook wb;	
public Exceldataprovider(){
File f=new File("./testdata/database.xlsx");
try {
	FileInputStream src=new FileInputStream(f);
	 wb=new XSSFWorkbook(src);

} catch (Exception e) {
	System.out.println("excel data file is uploaded"+e.getMessage());
}
}
public String getintdata(int indexname,int row,int coloum){
	return wb.getSheetAt(indexname).getRow(row).getCell(coloum).getStringCellValue();
}
public String getStringdata(String sheetname,int row,int coloum){
	return wb.getSheet(sheetname).getRow(row).getCell(coloum).getStringCellValue();
}
public double getnumericdata(String sheetname,int row,int coloum){
	return wb.getSheet(sheetname).getRow(row).getCell(coloum).getNumericCellValue();
	
}

}
