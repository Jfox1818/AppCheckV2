package com.appcheck.utils;

import org.springframework.stereotype.Component;

@Component
public class RosterActivityUtils {

    final String flightActivityCode = "FLIGHT";

    public String getFlightActivityCode() {
        return flightActivityCode.toUpperCase();
    }

}
