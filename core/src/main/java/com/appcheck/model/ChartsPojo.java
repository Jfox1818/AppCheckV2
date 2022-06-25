package com.appcheck.model;

import com.opencsv.bean.CsvBindByName;
/**
 *
 * @author  jfox
 * @version 1.0
 * @since   2021-11-29
 *
 * ChartsDb is a Plain Old Java Object (POJO) class for storing CSV file values from 'Charts' database, imported via CSV file.
 * OpenCSV library is imported and used to facilitate csv file import.
 * The variables are stored in volotile memory.
 *
 */

public class ChartsPojo {

    // using opencsv annotations, each field of the CSV file is bound to the respective variable
    @CsvBindByName(column = "User Name", required = true)
    public String userName;

    @CsvBindByName(column = "Device Name", required = true)
    public String deviceName;

    @CsvBindByName(column = "Current Package", required = true)
    public String currentPackage;

    @CsvBindByName(column = "Package Status", required = true)
    public String packageStatus;

    @CsvBindByName(column = "Current Revision", required = true)
    public String currentRevision;
    @CsvBindByName(column = "Revision Status", required = true)
    public String revisionStatus;

    @CsvBindByName(column = "App Version", required = true)
    public String appVersion;

    // Getter and Setter methods
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(String currentPackage) {
        this.currentPackage = currentPackage;
    }

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    public String getCurrentRevision() {
        return currentRevision;
    }

    public void setCurrentRevision(String currentRevision) {
        this.currentRevision = currentRevision;
    }

    public String getRevisionStatus() {
        return revisionStatus;
    }

    public void setRevisionStatus(String revisionStatus) {
        this.revisionStatus = revisionStatus;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    // toString Method to display the values of each stored variable
    @Override
    public String toString() {
        return "ChartsDb{" +
                "userName='" + userName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", currentPackage='" + currentPackage + '\'' +
                ", packageStatus='" + packageStatus + '\'' +
                ", currentRevision='" + currentRevision + '\'' +
                ", revisionStatus='" + revisionStatus + '\'' +
                ", appVersion='" + appVersion + '\'' +
                '}';
    }
}

