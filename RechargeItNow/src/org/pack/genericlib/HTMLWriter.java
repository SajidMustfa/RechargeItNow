package org.pack.genericlib;

import java.io.BufferedInputStream;
import java.net.URL;

import javax.xml.bind.DatatypeConverter;

public class HTMLWriter {
	
	public static void main(String[] args) throws Exception {
	    String urltext = "file:///C:/Users/mustfa/workspace/RechargeItNow/target/surefire-reports/html%20report/WorkFlowTest.html";
	    URL url = new URL(urltext);
	    BufferedInputStream bis = new BufferedInputStream(url.openStream());
	    byte[] imageBytes = new byte[0];
	    for(byte[] ba = new byte[bis.available()];
	        bis.read(ba) != -1;) {
	        byte[] baTmp = new byte[imageBytes.length + ba.length];
	        System.arraycopy(imageBytes, 0, baTmp, 0, imageBytes.length);
	        System.arraycopy(ba, 0, baTmp, imageBytes.length, ba.length);
	        imageBytes = baTmp;
	    }
	    System.out.println("<img src='../screenShots/png;base64," + DatatypeConverter.printBase64Binary(imageBytes) + "'>");
	}

}
