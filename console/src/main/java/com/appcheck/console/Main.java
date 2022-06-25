package com.appcheck.console;

import com.appcheck.configuration.AppConfig;
import com.appcheck.configuration.XmlUnmarshallerPerformance;
import com.appcheck.model.MessageGenerator;
import com.appcheck.model.RaidoOperatingCrew;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){
        log.info("Start App Check");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info("getStartMessage= {}", messageGenerator.getStartMessage());
        log.info("getDisplayMessage= {}", messageGenerator.getDisplayMessage());
        log.info("getEmailMessage= {}", messageGenerator.getEmailMessage());

        RaidoOperatingCrew raidoOperatingCrew = context.getBean(RaidoOperatingCrew.class);

        XmlUnmarshallerPerformance xmlUnmarshallerPerformance = context.getBean(XmlUnmarshallerPerformance.class);

        context.close();




    }
}
