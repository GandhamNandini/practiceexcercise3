package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculateWeekTest {
    CalculateWeek md;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("Inside setup");
        md = new CalculateWeek();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        md = null;
    }



}
