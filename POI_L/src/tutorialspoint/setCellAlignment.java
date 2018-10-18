package tutorialspoint;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.*;
public class setCellAlignment {  
        public static void main(String[] args) throws Exception{
                /* Create Workbook and Worksheet */
                HSSFWorkbook my_workbook = new HSSFWorkbook();
                HSSFSheet my_sheet = my_workbook.createSheet("Cell Alignment");
                /* Get access to HSSFCellStyle */
                HSSFCellStyle my_style_0 = my_workbook.createCellStyle();
                HSSFCellStyle my_style_1 = my_workbook.createCellStyle();
                HSSFCellStyle my_style_2 = my_workbook.createCellStyle();
                HSSFCellStyle my_style_3 = my_workbook.createCellStyle();
                        
                /* Top Left alignment */
                /* Left aligned horizontally */
                my_style_0.setAlignment(HSSFCellStyle.ALIGN_LEFT);
                /* top aligned vertically */
                my_style_0.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
                
                /* Center Align Cell Contents */
                my_style_1.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                my_style_1.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
                
                /* Bottom Right alignment */
                my_style_2.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
                my_style_2.setVerticalAlignment(HSSFCellStyle.VERTICAL_BOTTOM);
                
                /* Justified Alignment */
                my_style_3.setAlignment(HSSFCellStyle.ALIGN_JUSTIFY);
                my_style_3.setVerticalAlignment(HSSFCellStyle.VERTICAL_JUSTIFY);
                
                /* We will now attach these alignment options to cells */
                
                /* Attach border colors to a cell */
                Row row = my_sheet.createRow(0);                
                Cell cell = row.createCell(0);
                cell.setCellValue("Top Left");          
                cell.setCellStyle(my_style_0);
                
                row = my_sheet.createRow(1);            
                cell = row.createCell(1);
                cell.setCellValue("Center Aligned");            
                cell.setCellStyle(my_style_1);
                
                row = my_sheet.createRow(2);            
                cell = row.createCell(2);
                cell.setCellValue("Bottom Right");              
                cell.setCellStyle(my_style_2);
                
                row = my_sheet.createRow(3);            
                cell = row.createCell(3);
                cell.setCellValue("Contents are Justified in Alignment");               
                cell.setCellStyle(my_style_3);
                
                /* Write changes to the workbook */
                FileOutputStream out = new FileOutputStream(new File("C:\\cell_alignment_example.xls"));
                my_workbook.write(out);
                out.close();
        }
}