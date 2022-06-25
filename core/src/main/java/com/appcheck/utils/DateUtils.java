package com.appcheck.utils;

import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

@Component
public class DateUtils {

        private XMLGregorianCalendar instantDateNow;
        private XMLGregorianCalendar instantDatePlusThree;

        public void raidoDateNow() throws DatatypeConfigurationException {

                DatatypeFactory df = DatatypeFactory.newInstance();
                Instant instantDate = Instant.now();
                ZoneId zone = ZoneId.of("Europe/Paris");
                ZonedDateTime dateTime = instantDate.atZone(zone);
                GregorianCalendar c = GregorianCalendar.from(dateTime);
                instantDateNow = df.newXMLGregorianCalendar(c);

                System.out.println(instantDateNow);

                XMLGregorianCalendar date2 = (XMLGregorianCalendar) instantDateNow.clone();
                date2.add(df.newDuration("P3D"));

                instantDatePlusThree = date2;

                System.out.println(instantDatePlusThree);

        }

        public XMLGregorianCalendar getInstantDateNow() {
                return instantDateNow;
        }


        public XMLGregorianCalendar getInstantDatePlusThree() {
                return instantDatePlusThree;
        }


}