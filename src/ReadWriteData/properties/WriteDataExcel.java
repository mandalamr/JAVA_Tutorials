package ReadWriteData.properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataExcel {
    public static void main(String[] args) throws IOException {
        //Step:1
        //Create XSSF workbook
        XSSFWorkbook workbook= new XSSFWorkbook();
        //Create sheet in workbook
        XSSFSheet sheet1 = workbook.createSheet("sheet1");
        //create row in sheet 1
        Row r0= sheet1.createRow(0);
        //Create cell in Row 0
        Cell c0=r0.createCell(0);
        //Create file
        c0.setCellValue("Data 1");
        
        Row r1=sheet1.createRow(1);
        Cell c1=r1.createCell(1);
        c1.setCellValue("Data 2");

        File f=new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\ExcelData\\TestData.xlsx");
        //Create object fileoutputstream

        FileOutputStream fos=new FileOutputStream(f);
        workbook.write(fos);
        fos.close();
        workbook.close();
        System.out.println("File loaded successfully");



    }
}
