package com.appcheck.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 * @author  jfox
 * @version 1.0
 * @since   2021-12-09
 *
 * PerformanceReport is a Plain Old Java Object (POJO) class for mapping XML values from the Performance database.
 * It uses javax xml library to facilitate mapping using XML attribute annotations
 * The variables are stored in volotile memory using the model class PerformanceReport.
 *
 */


@XmlRootElement(name = "connectionReport")
@XmlAccessorType(XmlAccessType.FIELD)
public class PerformanceReport {

    @XmlElement
    private List<PerformancePojo> connectionInfos;

    public PerformanceReport(){
    }

    public List<PerformancePojo> getConnectionInfos() {
        return connectionInfos;
    }

    public void setConnectionReport(List<PerformancePojo> connectionInfos) {
        this.connectionInfos = connectionInfos;
    }

}

