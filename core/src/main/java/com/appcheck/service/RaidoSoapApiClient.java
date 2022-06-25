package com.appcheck.service;


// import com.appcheck.configuration.SoapClient;
import com.appcheck.service.RaidoSoapApiClient;
import com.appcheck.utils.DateUtils;
import com.aviolinx.raido.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

// @Component
public class RaidoSoapApiClient extends WebServiceGatewaySupport {

    final Logger log = LoggerFactory.getLogger(RaidoSoapApiClient.class);

        //    public GetRostersResponse getRoster(Party party, int crewId) throws DatatypeConfigurationException{

    public GetRostersResponse getRoster() throws DatatypeConfigurationException {

        //      XMLGregorianCalendar[] dates =  DateUtils.getDefaultRosterDates();
        DateUtils dateUtils = new DateUtils();
        dateUtils.raidoDateNow();
        XMLGregorianCalendar dateNow = dateUtils.getInstantDateNow();
        XMLGregorianCalendar datePlusThree = dateUtils.getInstantDatePlusThree();


        GetRosters request = new GetRosters();

        AuthenticateApiUser user = new AuthenticateApiUser();

        request.setUsername(user.getUsername());
        request.setPassword(user.getPassword());

        RosterRequestData rosterRequestData = new RosterRequestData();

        log.info("Requesting Roster Request Data");
        rosterRequestData.setTimes(false);
        rosterRequestData.setHotelDetails(false);
        rosterRequestData.setNotes(false);
        rosterRequestData.setTrainingSessions(false);
        request.setRosterRequestData(rosterRequestData);


        RosterRequestFilter filter = new RosterRequestFilter();

        log.info("Requesting Roster Request Filter");
        //filter.setUniqueId(98760);
        filter.setFrom(dateNow);
        filter.setTo(datePlusThree);
        filter.setRosterType(RosterType.PUBLISHED);
        filter.setOnlyActive(true);
        request.setRosterRequestFilter(filter);
        //return raidoService.getClient(party).getRoster(request);
        //return raidoService.getClient().getRoster(request);


        log.info("Setting request and passing to sendSoapMarshaller()");

        GetRostersResponse response = sendSoapMarshaller(request);

//        GetRostersResponse response = (GetRostersResponse) getWebServiceTemplate()
//                .marshalSendAndReceive("https://szsnoc.navblue.aero/raidoapi/raidoapi.asmx",request,
//                        new SoapActionCallback("http://raido.aviolinx.com/api/GetRosters"));
//
//
//        log.info("Response from " +  response.getClass().getName() + " received");

        return response;

     }

    public GetRostersResponse sendSoapMarshaller(GetRosters request){

         log.info("Called sendSoapMarshaller and creating GetRostersResponse and marshalling to Raido API");

         GetRostersResponse response = (GetRostersResponse) getWebServiceTemplate()
                 .marshalSendAndReceive("https://szsnoc.navblue.aero/raidoapi/raidoapi.asmx", request,
                         new SoapActionCallback("http://raido.aviolinx.com/api/GetRosters"));


        log.info("Response from " +  response.getClass().getName() + " received");

        return response;
    }

}

