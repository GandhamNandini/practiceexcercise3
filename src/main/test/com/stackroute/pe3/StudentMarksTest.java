package com.stackroute.pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks marks;
    @org.junit.Before
    public void setUp() throws Exception {
        marks=new StudentMarks();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        marks=null;
    }
    @Test
    public void givenIntShouldReturnStudentMarks(){
        String student=marks.Student(2,new int[]{-20,0});
        assertEquals("Invalid marks",student);

    }
    @Test
    public void givenIntShouldReturnStudentGrade(){
        String student=marks.Student(2,new int[]{50,60});
        assertEquals("Student passed",student);

    }
    public void givenIntShouldReturnMarks(){
        String student=marks.Student(2,new int[]{0,0});
        assertEquals("Invalid marks",student);

    }
}