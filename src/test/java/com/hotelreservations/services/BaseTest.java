package com.hotelreservations.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

public class BaseTest {

    RequestSpecification spec;

    public BaseTest(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .addFilters(Arrays.asList(new ResponseLoggingFilter() , new ResponseLoggingFilter()))
                .build();

    }
}
