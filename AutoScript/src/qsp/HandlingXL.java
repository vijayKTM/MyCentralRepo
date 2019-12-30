package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingXL {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		Workbook wk = WorkbookFactory.create(new File("./TestData/TestData.xlsx"));
		String xyz = wk.getSheet("Demo").getRow(1).getCell(0).toString();
		
		System.out.println(xyz);
		
		
		
	}

}
