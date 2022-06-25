package com.appcheck.utils;

public class CrewUtils {

    private static final String CREWCAPTAINRANK = "CP";
    private static final String CREWFIRSTOFFICERRANK = "FO";
    private static final String CREWSENIORCABINCREWRANK = "SCC";
    private static final String CREWCABINCREWRANK = "CC";

    public String getCrewFirstOfficerRank() {
        return CREWFIRSTOFFICERRANK.toUpperCase();
    }

    public String getCrewSeniorCabinCrewRank() {
        return CREWSENIORCABINCREWRANK.toUpperCase();
    }

    public String getCrewCabinCrewRank() {
        return CREWCABINCREWRANK.toUpperCase();
    }

    public String getCrewCaptainRank() {
        return CREWCAPTAINRANK.toUpperCase();
    }

}
