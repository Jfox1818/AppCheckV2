package com.appcheck.model;

import com.aviolinx.raido.api.Crew;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

public interface RaidoOperatingCrew {

    void displayFetchedOperatingFlightCrew() throws DatatypeConfigurationException;

    List<Crew> fetchOperatingFlightCrew() throws DatatypeConfigurationException;
}
