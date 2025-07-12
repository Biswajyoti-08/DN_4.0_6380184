package com.cognizant.spring_learn.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    // Empty constructor with debug log
    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    // Getter for code
    public String getCode() {
        LOGGER.debug("Inside getCode()");
        return code;
    }

    // Setter for code
    public void setCode(String code) {
        LOGGER.debug("Inside setCode() with value: {}", code);
        this.code = code;
    }

    // Getter for name
    public String getName() {
        LOGGER.debug("Inside getName()");
        return name;
    }

    // Setter for name
    public void setName(String name) {
        LOGGER.debug("Inside setName() with value: {}", name);
        this.name = name;
    }

    // toString method
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
 