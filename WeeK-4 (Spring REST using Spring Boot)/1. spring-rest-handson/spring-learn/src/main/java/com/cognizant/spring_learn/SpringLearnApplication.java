package com.cognizant.spring_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.model.Country;

public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START");

        displayCountry();
        displayCountries();

        LOGGER.info("END");
    }

    public static void displayCountry() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country 1: {}", country.toString());

        Country anotherCountry = context.getBean("country", Country.class);
        LOGGER.debug("Country 2: {}", anotherCountry.toString());

        LOGGER.debug("Are both references the same? {}", country == anotherCountry);

        ((ClassPathXmlApplicationContext) context).close();

        LOGGER.info("END");
    }

    public static void displayCountries() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        for (Country country : countryList) {
            LOGGER.debug("Country: {}", country.toString());
        }

        ((ClassPathXmlApplicationContext) context).close();

        LOGGER.info("END");
    }
}
