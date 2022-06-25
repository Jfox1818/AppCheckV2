package com.appcheck.model;

import com.appcheck.AppCheckApplication;
// import com.appcheck.configuration.RaidoClientInit;

import com.appcheck.service.RaidoSoapApiClient;
import com.appcheck.utils.CrewUtils;
import com.appcheck.utils.RosterActivityUtils;
import com.aviolinx.raido.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.List;

@Component
public class RaidoOperatingCrewImpl implements RaidoOperatingCrew {

    // constants
    private static final Logger log = LoggerFactory.getLogger(AppCheckApplication.class);

    // fields
    private final RaidoSoapApiClient raidoSoapApiClient;
    private final RosterActivityUtils rosterActivityUtils;
    private final CrewUtils crewUtils;
    private boolean start;


    // constructors

    @Autowired
    // public RaidoOperatingCrewImpl(@RaidoClientInit RaidoSoapApiClient client) {
     public RaidoOperatingCrewImpl(RaidoSoapApiClient client) {
        this.raidoSoapApiClient = client;
        this.rosterActivityUtils = new RosterActivityUtils();
        this.crewUtils = new CrewUtils();
        this.start = false;
        log.info("constructor 1 initiated and RaidoOperatingCrew instantiated with RaidoSoapApiClient ");

    }

//    public RaidoOperatingCrewImpl() {
//        this.raidoSoapApiClient = new RaidoSoapApiClient();
//        this.rosterActivityUtils = new RosterActivityUtils();
//        this.crewUtils = new CrewUtils();
//        this.start = false;
//        log.info("constructor 2 initiated and RaidoOperatingCrew instantiated with default values");
//
//    }

    public ArrayOfCrew callRaidoSoapApiResponse() throws DatatypeConfigurationException {
        GetRostersResponse response = raidoSoapApiClient.getRoster();
        ArrayOfCrew arrayOfCrew = response.getGetRostersResult();

        return arrayOfCrew;
    }

    @Override
    public List<Crew> fetchOperatingFlightCrew() throws DatatypeConfigurationException {


        int countCrew = 0;
        int countRosterActivityPerCrew = 0;
        int total = 0;

        ArrayOfCrew arrayOfCrew = callRaidoSoapApiResponse();
        List<Crew> listOfAllCrew = arrayOfCrew.getCrew();
        List<Crew> listOfOperatingFlightCrew = new ArrayList<Crew>();
        List<Crew> listOfAllFlightCrew = new ArrayList<Crew>();
        ArrayOfRosterActivity arrayOfRosterActivities;
        List<RosterActivity> listOfRosterActivity;

        for (Crew crew : listOfAllCrew) {

            arrayOfRosterActivities = crew.getRosterActivities();
            listOfRosterActivity = arrayOfRosterActivities.getRosterActivity();

            log.debug("CountCrew { }" + countCrew);
            //System.out.println("CountCrew = " + countCrew);
            countCrew++;
            countRosterActivityPerCrew = 0;

            log.debug("rank of crew is {}" + crew.getRank());
            // System.out.println("rank of crew is: " + crew.getRank());

            if (crew.getRank().equals(crewUtils.getCrewCaptainRank()) || (crew.getRank().equals(crewUtils.getCrewFirstOfficerRank()))){
                listOfAllFlightCrew.add(crew);

            }

            for (RosterActivity rosterActivity : listOfRosterActivity) {
                //if (rosterActivity.getActivitySubType().isEmpty()) {
                // If one flight acitvity is found, add to List, print and break to next crew.

                if (rosterActivity.getActivityType().toString() == rosterActivityUtils.getFlightActivityCode()
                        && (crew.getRank().equals(crewUtils.getCrewCaptainRank()) || (crew.getRank().equals(crewUtils.getCrewFirstOfficerRank())))) {

                    log.debug(crew.getNumber());

                    listOfOperatingFlightCrew.add(crew);
                    total++;
                    break;
                }


                log.debug("countRosterActivity {}" + countRosterActivityPerCrew);
                // System.out.println("countRosterActivity = " + countRosterActivityPerCrew);
                countRosterActivityPerCrew++;
            }



        }

        log.debug("Flight Crew fetched successfully.");
        log.info("The total crew is: " + total);
        log.info("The total list of all crew is {}" + listOfAllCrew.size());
        log.info("The total list of all flight crew is {}" + listOfAllFlightCrew.size());



        return listOfOperatingFlightCrew;
    }

    @Override
    public void displayFetchedOperatingFlightCrew() throws DatatypeConfigurationException {


        List<Crew> listOfOperatingCrew = fetchOperatingFlightCrew();


        for (Crew crew : listOfOperatingCrew) {
            log.info(crew.getFirstname() + " " + crew.getLastname() + " , " +  crew.getRank() + " , " +
                    crew.getBase());

        }

        log.info("The total size of operating Flight Crew {}" + listOfOperatingCrew.size());

    }


    public void setStart(boolean start) {
        this.start = start;
    }
}
