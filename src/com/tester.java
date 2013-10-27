package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.*;

import com.CustomerCreditTransferInitiation.CdtTrfTxInf;
import com.CustomerCreditTransferInitiation.CstmrCdtTrfInitn;
import com.comun.Cdtr_Dbtr;

public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Element e = new Element("root") ;
		CstmrCdtTrfInitn c = new CstmrCdtTrfInitn();
		c.montar(e);
		
		// grabar el fichero //
		
		Document doc = new Document (e);
		org.jdom.output.Format format = org.jdom.output.Format.getRawFormat();
		format.setEncoding("ISO-8859-1");
		XMLOutputter out = new XMLOutputter();
		out.setFormat(format);
		
	    FileWriter fichero;

        File f = new File ("prueba.xml");
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(f);
        int r = fc.showOpenDialog(fc);
	    
		try {
			fichero = new FileWriter(fc.getSelectedFile().getAbsolutePath());
	        out.output(doc, fichero);
	        fichero.flush();
	        fichero.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}                                        
		
	
		
	}

}
