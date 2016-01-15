package org.pack.genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class MSWordTestEvidence {
	
	static String FileNamePath;
	static String FileName="WorkFlowTest.html";
	//static String value="Step 1";
	
	public static String getFilePath() throws IOException{
		
		File directory = new File(".");	
	    try {
	    	FileNamePath = directory.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	   // System.out.println(FileNamePath);
		//return FileNamePath+"\\TestEvidence\\"+FileName;
	    return directory.getCanonicalPath() + "/target/surefire-reports/screenShots/" + FileName;
		
	}
	public static void main(String[]args) throws IOException, InvalidFormatException{
		/*XWPFDocument document= new XWPFDocument();
		InputStream pic = new FileInputStream("C:\\Users\\mustfa\\workspace\\RechargeItNow\\target\\surefire-reports\\screenShots\\12-01-2015_10.03.58_12-01-2015_10.03.58_WorkFlowTest.png.png");
		byte [] picbytes = IOUtils.toByteArray(pic);
		//document.addPictureData(picbytes, Document.PICTURE_TYPE_PNG);
		
		System.out.println(MSWordTestEvidence.getFilePath());
		
		XWPFParagraph paragraph=document.createParagraph();
		
		XWPFRun run=paragraph.createRun();
		
		run.setBold(true);
		paragraph.setAlignment(ParagraphAlignment.CENTER);
		run.setText("WorkFlowTest");
		paragraph.setAlignment(ParagraphAlignment.LEFT);
		for(int i=1;i<=10;i++){
		run.addBreak();
		run.setBold(true);
		run.setText("Step "+i);
		run.addBreak();
		run.addPicture(pic, XWPFDocument.PICTURE_TYPE_PNG, "12-01-2015_10.03.58_12-01-2015_10.03.58_WorkFlowTest.png",300,300);
		//run.addPicture(arg0, arg1, arg2, arg3, arg4)
*/		//}
		FileOutputStream fis = new FileOutputStream(MSWordTestEvidence.getFilePath());
	//document.write(fis);
		/*document.addPictureData(picbytes, Document.PICTURE_TYPE_PNG);
		document.addPictureData(pic,Document.PICTURE_TYPE_PNG);*/
		fis.close();

	   
	}


}
