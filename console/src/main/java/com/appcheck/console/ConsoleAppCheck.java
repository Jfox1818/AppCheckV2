package com.appcheck.console;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.appcheck.configuration.XmlUnmarshallerPerformance;
import com.appcheck.model.MessageGenerator;
import com.appcheck.model.RaidoOperatingCrew;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Scanner;

@Component
public class ConsoleAppCheck {

    // constants
    private static final Logger log = LoggerFactory.getLogger(ConsoleAppCheck.class);

    // feilds
    @Autowired
    private RaidoOperatingCrew raidoOperatingCrew;

    @Autowired
    private XmlUnmarshallerPerformance xmlUnmarshallerPerformance;

    @Autowired
    private MessageGenerator messageGenerator;

    // events
    @EventListener(ContextRefreshedEvent.class)
    public void start() throws DatatypeConfigurationException {
        log.info("start() - Container ready for use");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println(messageGenerator.getStartMessage());
            System.out.println(messageGenerator.getDisplayMessage());
            System.out.println(messageGenerator.getEmailMessage());

            boolean start = scanner.nextBoolean();
            scanner.nextLine();
            messageGenerator.setStart(start);
            messageGenerator.getStartMessage();

            if(start){
                System.out.println(messageGenerator.getStartMessage());
                // raidoOperatingCrew.fetchOperatingFlightCrew();
                raidoOperatingCrew.displayFetchedOperatingFlightCrew();

                xmlUnmarshallerPerformance.importPerformance();

            }

            // if start is true, perform getoperatingcrew
        }
    }
}
