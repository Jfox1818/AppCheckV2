package com.appcheck.configuration;


import com.appcheck.model.PerformancePojo;
import com.appcheck.model.PerformanceReport;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

// reference: https://howtodoinjava.com/jaxb/read-xml-to-java-object/

/**
 *
 * @author  jfox
 * @version 2.0
 * @since   2021-12-03
 *
 * CsvToBeanManuals is the class that utilises XML JAXB unmarshalling and IO libraries to read the 'Performance' XML file and save to volatile memory using JavaBeans.
 * The model class used to map the XMl import named PerformanceInfos.
 * The method importPerformance() can be used to import, store the values in volatile memory and print the XML file contents
 *
 */

// @Component
public class XmlUnmarshallerPerformance {
//    public XmlUnmarshallerPerformance() {
//    }

    // constructor
    // public XmlUnmarshallerPerformance(){};

    // declare  class variables
//    private String directory;
//    private String fileName;
//    private File performanceXmlFile = new File(new FileNameUtils().

   //  public FindInboundFile findInboundFile;


    // static method used to import, store and print the XML report.
    public void importPerformance() {

        // declare and instantiate a File variable from the IO libary and assign the location of the XML file
        File performanceXmlFile = new File("D:/My Documents/JONNY/OneDrive - National College of Ireland/Project/AppCheck/AppCheck/AppCheck/src/main/resources/CsvFiles/connection_report.xml");

        // findInboundFile = (FindInboundFile) findInboundFile.findFile(directory,fileName);



        // performanceXmlFile =  new File(directory,fileName);

        // try/catch block to catch any exceptions as stipulated when reading IO File variables
        try {

            // Delare JAXBContext to provide an abstration in order to unmarshal an XML file
            JAXBContext jc = JAXBContext.newInstance(PerformanceReport.class);

            // declare and assign an unmarshaller to deserialise XML data
            Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();

            // operation to unmarshal XML file
            PerformanceReport report = (PerformanceReport) jaxbUnmarshaller.unmarshal(performanceXmlFile);


            for (PerformancePojo infos : report.getConnectionInfos()) {
                System.out.println(report.getConnectionInfos());
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

//    public void setDirectory(String directory) {
//        this.directory = directory;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public void setPerformanceXmlFile(File performanceXmlFile) {
//        this.performanceXmlFile = performanceXmlFile;
//    }

}


