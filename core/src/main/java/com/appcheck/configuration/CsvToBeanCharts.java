package com.appcheck.configuration;

import com.appcheck.model.ChartsPojo;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author  jfox
 * @version 1.0
 * @since   2021-12-12
 *
 * CsvToBeanCharts is the class that utilises OpenCSV and IO libraries to read the ChartsCSV file and save to volatile memory using JavaBeans.
 * The POJO classes used to map the Javabeans are models called 'ChartsDb'.
 * The importCharts() method can be called to import, store and print the Charts CSV file
 *
 */

public class CsvToBeanCharts {

    // method  to import, store and print the Charts CSV file
    public static void importCharts() {


        // Declare File variables from IO library and instantiate to the target pathname, stored locally.
        File chartsCsvFile = new File("D:\\My Documents\\JONNY\\OneDrive - National College of Ireland\\Project\\AppCheck\\AppCheck\\AppCheck\\src\\main\\resources\\CsvFiles\\UserDeviceExport_SAS Ireland NCDIS.csv");

        // try/catch is required to Read/Write to File using IO library
        try {
            // Declare and instantiate File Reader to read the file variable.
            FileReader chartsReader = new FileReader(chartsCsvFile);

            // Declare a List of ChartsDb objects and instantiate and assign the CSV field values that are mapped on chartsDb object to the list of objects
            List<ChartsPojo> chartsPojoBean = new CsvToBeanBuilder(chartsReader).withType(ChartsPojo.class).build().parse();

            // Loop through the list of ChartsDb objects and print the list using an appropriate getter method
            System.out.println("Start Charts CSV import \n USERNAME / INSTALLED CHARTS VERSION");
            for (ChartsPojo chartElement : chartsPojoBean) {
                System.out.println(chartElement.getUserName() + " / " + chartElement.getAppVersion());
            }
            System.out.println("End of Charts CSV import \n \n");

            chartsReader.close();

        // catch block to catch no file found and exception errors.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

