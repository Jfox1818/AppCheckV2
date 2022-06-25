package com.appcheck.service;


import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.List;

public interface FetchOperatingCrew {

    List listOfOperatingCrew() throws DatatypeConfigurationException;

}
