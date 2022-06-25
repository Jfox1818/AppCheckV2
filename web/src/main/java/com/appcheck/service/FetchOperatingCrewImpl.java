package com.appcheck.service;

import com.appcheck.model.RaidoOperatingCrew;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class FetchOperatingCrewImpl implements FetchOperatingCrew{

    // fields
    private final List listOfOperatingCrew;
    private final RaidoOperatingCrew raidoOperatingCrew;

    // construtor
    @Autowired
    public FetchOperatingCrewImpl(List listOfOperatingCrew, RaidoOperatingCrew raidoOperatingCrew) {
        this.listOfOperatingCrew = listOfOperatingCrew;
        this.raidoOperatingCrew = raidoOperatingCrew;
    }

    // public methods

    @Override
    public List listOfOperatingCrew() throws DatatypeConfigurationException {
        return raidoOperatingCrew.fetchOperatingFlightCrew();
    }


}
