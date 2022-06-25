package com.appcheck;

import com.appcheck.configuration.XmlUnmarshallerPerformance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.datatype.DatatypeConfigurationException;

@SpringBootApplication
public class AppCheckApplication {
    public static <MyFilenameFilter> void main(String[] args) throws DatatypeConfigurationException {

        // SpingBoot application
        SpringApplication.run(AppCheckApplication.class, args);


        // Demonstration of CSV import
//        CsvToBeanCharts.importCharts();
//        CsvToBeanManuals.importManuals();


    }

}



//    @Bean

//    public CommandLineRunner lookup(RaidoSoapApiClient raidoSoapApiClient) {
//        return args -> {
//
//            final Logger LOG = LoggerFactory.getLogger(AppCheckApplication.class);
//            GetRostersResponse response = (GetRostersResponse) raidoSoapApiClient.getRoster();
//
//            ArrayOfCrew arrayOfCrew= response.getGetRostersResult();
//
//            List<Crew> listOfAllCrew = arrayOfCrew.getCrew();
//            List<Crew> listOfOperatingCrew = new ArrayList<Crew>();
//
//            raidoSoapApiClient.getRoster();
//
//            FetchRaidoOperatingCrew fetchRaidoOperatingCrew = new FetchRaidoOperatingCrew(raidoSoapApiClient);
//            fetchRaidoOperatingCrew.displayFetchedOperatingFlightCrew();
//        };
//    }
// }
// }
