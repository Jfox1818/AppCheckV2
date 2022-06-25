package com.appcheck.configuration;

import com.appcheck.service.RaidoSoapApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

// The programmer Guide Implementation "https://www.youtube.com/watch?v=LMi3GlKbrHs"

//@Configuration
//@ImportResource({"classpath*:applicationContext.xml"})
//class XmlConfiguration {
//}

@Configuration
public class RaidoSoapApiConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.aviolinx.raido.api");
        return marshaller;
    }

    @Bean
//    @SoapClient
    public RaidoSoapApiClient soapClient(Jaxb2Marshaller marshaller){
        RaidoSoapApiClient client = new RaidoSoapApiClient();
        client.setDefaultUri("https://szsnoc.navblue.aero/raidoapi/raidoapi");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
