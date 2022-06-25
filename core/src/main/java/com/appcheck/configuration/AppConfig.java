package com.appcheck.configuration;

import com.appcheck.model.*;
import com.appcheck.service.RaidoSoapApiClient;
import com.appcheck.utils.DateUtils;
import com.appcheck.utils.FileNameUtils;
import com.appcheck.utils.RosterActivityUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.io.File;

@Configuration
@Import(RaidoSoapApiConfig.class)
@ComponentScan(basePackages = "com.appcheck")
public class AppConfig {

    @Bean
    public RosterActivityUtils roster(){
        return new RosterActivityUtils();
    }

    @Bean
    public DateUtils date(){
        return new DateUtils();
    }

//    @Bean
// //   @RaidoClientInit
//    public RaidoSoapApiClient client(){
//        return new RaidoSoapApiClient();
//    }

    @Bean
    public MessageGenerator messageGenerator(){
        return new MessageGeneratorImpl();
    }

//    @Bean
//    public FindInboundFile findInboundFile(){
//        return new FindInboundFileImpl();
//    }

//    @Bean
//    public RaidoOperatingCrewImpl RaidoOperatingCrewImpl(){ return new RaidoOperatingCrewImpl();}

//    @Bean
//    public FileNameUtils fileNameUtils() { return new FileNameUtils(); }
//
//
//
//    @Bean
//    public XmlUnmarshallerPerformance xmlUnmarshallerPerformance(FileNameUtils fileNameUtils) {
//        XmlUnmarshallerPerformance xmlUnmarshallerPerformance = new XmlUnmarshallerPerformance();
//        File directory = new File(fileNameUtils.getDirectory());
//        xmlUnmarshallerPerformance.setDirectory(fileNameUtils.getDirectory());
//        xmlUnmarshallerPerformance.setFileName(fileNameUtils.getPerformancefile());
//        FindInboundFileImpl findInboundFile = new FindInboundFileImpl(directory,fileNameUtils.getDirectory(),fileNameUtils.getPerformancefile());
//        return xmlUnmarshallerPerformance;
//    }

    @Bean
    public XmlUnmarshallerPerformance xmlUnmarshallerPerformance() { return new XmlUnmarshallerPerformance(); }


}
