package testNGProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParametarizationUsingForLoop 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path = "D:\\ExelSheet\\PracticeDoc.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet a = WorkbookFactory.create(file).getSheet("Karishma");
		int rowNum = a.getLastRowNum();
		//System.out.println(rowNum);
		int exactRowCount = rowNum +1;
		System.out.println(exactRowCount);
		//if we want to find the exact row count then we have to add + 1 in it....
		Row row1 = a.getRow(0);
		int cellCount = row1.getLastCellNum();
		System.out.println(cellCount);
		
		for(int i=0; i<exactRowCount; i++)
		{
			for(int j=0; j<cellCount; j++)
			{
				String str = a.getRow(i).getCell(j).getStringCellValue();
				System.out.print(str+ "  ");
			}
			System.out.println();
		}
}
}