package com.appcheck.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageGeneratorImpl implements MessageGenerator{

    // constants
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);


    // fields
    private boolean start = false;

    // public methods
    @Override
    public String getStartMessage() {
        if(!start) {
            return "Select 'START' button or enter 'true' to begin.";
        }
        else {
            return "Scanning for active crew";
        }
    }

    @Override
    public String getDisplayMessage() {
        // TODO implement logic here
        return "getDisplayMessage() called";
    }

    @Override
    public String getEmailMessage() {
        // TODO implement logic here
        return "getEmailMessage() called";
    }

    @Override
    public void setStart(boolean start) {
        this.start = start;
    }
}
