package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard cb;

    @Before
    public void setUp() throws Exception {
        cb = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] actual = cb.display(8,8);

        assertArrayEquals("Following is chessPattern output",expected,actual);
    }

    @Test
    public void check1() {
        String expected[][]={{"WW","BB","WW","BB"},{"WW","BB","WW","BB"},{"WW","BB","WW","BB"},{"WW","BB","WW","BB"}};

        String [][] actual = cb.display(4,4);

        assertArrayEquals("Following is chessPattern output",expected,actual);
    }

    @Test
    public void check2() {
        String expected[][]={};

        String [][] actual = cb.display(0,0);

        assertArrayEquals("Following is chessPattern output",expected,actual);
    }






}