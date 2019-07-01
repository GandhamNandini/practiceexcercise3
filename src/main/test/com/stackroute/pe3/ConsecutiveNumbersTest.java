package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consnum;

    @Before
    public void setUp() throws Exception {
        consnum = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkNon() {
       String expected="Non-Consecutive";

        String actual = consnum.checkConsecutive("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne() {
        String expected = "Consecutive";
        String actual = consnum.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        String expected = "Non-Consecutive";
        String actual = consnum.checkConsecutive("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonCons1() {
        String expected = "NotApplicable";
        String actual = consnum.checkConsecutive("2");

        assertEquals(expected, actual);
    }


}