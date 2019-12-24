package com.unit1.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {

    @Before
    public void setup() {
        System.out.println("Here you can setup something like Selenium or logging");
    }

    @After
    public void teardown() {
        System.out.println("Here you can close a browser or a DB connection");
    }
}
