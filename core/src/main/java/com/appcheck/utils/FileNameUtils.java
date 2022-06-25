package com.appcheck.utils;

import org.springframework.stereotype.Component;

public class FileNameUtils {

    private static final String PERFORMANCEFILE = "connection_report.xml";
    private static final String CHARTSFILE = "UserDeviceExport_SAS Ireland NCDIS_SZSEFB";
    private static final String MANUALSFILE = "tracking_users";
    private static final String DIRECTORY = "D:/My Documents/JONNY/OneDrive - National College of Ireland/Project/Data CSV";

    public String getPerformancefile() {
        return PERFORMANCEFILE;
    }

    public String getChartsfile() {
        return CHARTSFILE;
    }

    public String getManualsfile() {
        return MANUALSFILE;
    }

    public String getDirectory() {
        return DIRECTORY;
    }

}
