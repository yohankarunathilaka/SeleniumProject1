package Utility;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadExcel {

    public String readExcel (int row, int col, String fileName, String sheetName) throws IOException{

        File file = new File(fileName);

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook ExcelWBook = new XSSFWorkbook(inputStream);

        XSSFSheet excelSheet = ExcelWBook.getSheet(sheetName);

        return excelSheet.getRow(row).getCell(col).getStringCellValue().toString();

    }
}
