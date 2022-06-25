package com.appcheck.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
    *
    * @author  jfox
    * @version 2.0
    * @since   2021-12-09
    *
    * PerformanceInfos is a Plain Old Java Object (POJO) class for mapping XML values from the Performance database.
    * It uses javax xml library to facilitate mapping using XML attribute annotations
    * The variables are stored in volotile memory using the model class PerformanceReport.
    *
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class PerformancePojo {

    // W3C UTC date format stored in a string
    @XmlAttribute(name = "date", required = true)
    public String date;

    @XmlAttribute(name = "userName")
    public String name;

    @XmlAttribute(name = "version")
    public String version;

    @XmlAttribute(name = "device")
    public String device;

    @XmlAttribute(name = "status")
    public String status;

    @XmlAttribute(name = "login", required = true)
    public String Username;

    @XmlAttribute(name = "udid", required = true)
    public String uniqueDeviceIdentifier;


    // empty constructor
    public PerformancePojo() {
    }


    // getters and setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUniqueDeviceIdentifier() {
        return uniqueDeviceIdentifier;
    }

    public void setUniqueDeviceIdentifier(String uniqueDeviceIdentifier) {
        this.uniqueDeviceIdentifier = uniqueDeviceIdentifier;
    }

    // toString method to display the parameter values
    @Override
    public String toString() {
        return "PerformanceDb{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", device='" + device + '\'' +
                ", status='" + status + '\'' +
                ", Username='" + Username + '\'' +
                ", uniqueDeviceIdentifier='" + uniqueDeviceIdentifier + '\'' +
                '}';
    }

}
