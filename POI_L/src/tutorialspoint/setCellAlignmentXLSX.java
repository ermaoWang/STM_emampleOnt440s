package tutorialspoint;

import java.io.*;
import org.apache.poi.xssf.usermodel.*; 
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
public class setCellAlignmentXLSX {  
        public static void main(String[] args) throws Exception{
                /* Create Workbook and Worksheet XLSX Format */
                XSSFWorkbook my_workbook = new XSSFWorkbook();
                XSSFSheet my_sheet = my_workbook.createSheet("Cell Alignment");
                /* Get access to XSSFCellStyle */
                XSSFCellStyle my_style_0 = my_workbook.createCellStyle();
                XSSFCellStyle my_style_1 = my_workbook.createCellStyle();
                XSSFCellStyle my_style_2 = my_workbook.createCellStyle();
                XSSFCellStyle my_style_3 = my_workbook.createCellStyle();
                
                /* Top Left alignment */
                /* Left aligned horizontally */
                my_style_0.setAlignment(HorizontalAlignment.LEFT);
                /* top aligned vertically */
                my_style_0.setVerticalAlignment(VerticalAlignment.TOP);
                
                /* Center Align Cell Contents */
                my_style_1.setAlignment(HorizontalAlignment.CENTER);
                my_style_1.setVerticalAlignment(VerticalAlignment.CENTER);
                
                /* Bottom Right alignment */
                my_style_2.setAlignment(HorizontalAlignment.RIGHT);
                my_style_2.setVerticalAlignment(VerticalAlignment.BOTTOM);
                
                /* Justified Alignment */
                my_style_3.setAlignment(HorizontalAlignment.JUSTIFY);
                my_style_3.setVerticalAlignment(VerticalAlignment.JUSTIFY);
                
                /* Attach style to XLSX sheet */
                
                Row row = my_sheet.createRow(0);
                Cell cell = row.createCell(0);
                cell.setCellValue("Top Left");
                cell.setCellStyle(my_style_0);
                
                row = my_sheet.createRow(1);
                cell = row.createCell(1);
                cell.setCellValue("Center");
                cell.setCellStyle(my_style_1);
                
                row = my_sheet.createRow(2);
                cell = row.createCell(2);
                cell.setCellValue("Bottom Right");
                cell.setCellStyle(my_style_2);
                
                row = my_sheet.createRow(3);
                cell = row.createCell(3);
                cell.setCellValue("Fully Justified Alignment");
                cell.setCellStyle(my_style_3);
                
                /* Write changes to the workbook */
                FileOutputStream out = new FileOutputStream(new File("C:\\cell_alignment.xlsx"));
                my_workbook.write(out);
                out.close();
        }
}