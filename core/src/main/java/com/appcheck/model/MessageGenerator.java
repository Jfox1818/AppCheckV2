package com.appcheck.model;

public interface MessageGenerator {

    String getStartMessage();

    String getDisplayMessage();

    String getEmailMessage();

    void setStart(boolean start);
}
