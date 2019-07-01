package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesTest {
    Places cc;

    @Before
    public void setUp() throws Exception {
        cc = new Places();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String[] expected = {"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = cc.removeVowels(str);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void checknull() {
        String[] expected = {"nd",null};
        String[] str = {"india",null};
        String[] actual = cc.removeVowels(str);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void check2() {
        String[] expected = {"a","e",};
        String[] str = {"a","e"};
        String[] actual = cc.removeVowels(str);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void check3() {
        String[] expected = {"A"};
        String[] str = {"Aeiou"};
        String[] actual = cc.removeVowels(str);

        assertArrayEquals(expected, actual);
    }


}