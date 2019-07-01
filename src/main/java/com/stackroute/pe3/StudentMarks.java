package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public String Student(int numOfStudents,int[] stuGrades)
    {
        String result=" ";
        if (numOfStudents <= 0)
        {
            result= "Invalid number of students.";
        }


       for(int i=0;i<numOfStudents;i++)
       {
            // check if grade is between 0 and 100
            if ((stuGrades[i] >= 1) && (stuGrades[i] <= 100)) {
               result="Student passed";
            }
            else
                {
                result="Invalid marks";
            }

        }
        return result;

    }
}
