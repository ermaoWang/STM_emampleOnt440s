package tutorialspoint;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class CreateWorkBook {
   public static void main(String[] args)throws Exception {
      
	   try {
	   //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook(); 
      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));
      XSSFSheet Spreadsheet = workbook.createSheet("Deno_001");
      //write operation workbook using file out object 
      workbook.write(out);
      out.close();
       
	   }
   catch(Exception e) {
	   System.out.println(e);
   }
      System.out.println("createworkbook.xlsx written successfully");
   }
}