package com.appcheck.configuration;

import com.appcheck.model.ManualsPojo;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author  jfox
 * @version 4.0
 * @since   2021-12-15
 *
 * CsvToBeanManuals is the class that utilises OpenCSV and IO libraries to read the Manuals CSV file and save to volatile memory using JavaBeans.
 * The POJO class used to map to Javabeans is the model called 'ManualsDb'.
 * The method importManuals() is can be used to import, store and print the CSV file
 *
 */


public class CsvToBeanManuals {

    // Method to import, store and print Manuals CSV file. Throw exception if no CSV file is found
    public static void importManuals() {

        // Declare File variable from IO library and instantiate to the target pathname, stored locally.
        File manualsCsvFile = new File("D:\\My Documents\\JONNY\\OneDrive - National College of Ireland\\Project\\AppCheck\\AppCheck\\AppCheck\\src\\main\\resources\\CsvFiles\\tracking_users_2021_10_12_23_12_05_summary.csv");

        // try/catch is required to Read/Write to File using IO library
        try {
            // Declare and instantiate File Reader to read the file variable.
            FileReader manualsReader = new FileReader(manualsCsvFile);

            // Declare a List of ChartsDb objects and instantiate and assign the CSV field values that are mapped on chartsDb object to the list of objects
            List<ManualsPojo> manualsPojoBean = new CsvToBeanBuilder(manualsReader).withType(ManualsPojo.class).build().parse();

            // Loop through the list of ChartsDb objects and print the list using an appropriate getter method
            System.out.println("Start Manuals CSV import \n EMAIL ADDRESS / LAST SYNC DATE / NI COUNT / NI-OOD COUNT / LI DATE / TOTAL COUNT");
            for (ManualsPojo manualsElement : manualsPojoBean) {
                System.out.println(manualsElement.getEmail() + " / " +
                        manualsElement.getLastSyncDate() + " / " +
                        manualsElement.getNotInstalledCount() + " / " +
                        manualsElement.getNotInstalledOutOfDateCount() + " / " +
                        manualsElement.getLastInstallDate() + " / " +
                        manualsElement.getTotalCount());
            }
            System.out.println("End of Manuals CSV import");

            manualsReader.close();

            // catch block to catch no file found and exception errors.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

