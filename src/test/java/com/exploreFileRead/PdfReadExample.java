/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 10-Dec-2019
 *  FILE NAME  		: 	 PdfReadExample.java
 *  PROJECT NAME 	:	 ExploringAutomation
 * 	Class Time		:    5:19:11 pm
 */
package com.exploreFileRead;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class PdfReadExample {

   
    public static void main(String[] args) {

        PdfReader reader;

        try {

            reader = new PdfReader("../ExploringAutomation/pdf-sample.pdf");

            
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
