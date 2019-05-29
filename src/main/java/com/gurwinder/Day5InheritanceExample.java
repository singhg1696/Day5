package com.gurwinder;

import com.gurwinder.college.Faculty;
import com.gurwinder.college.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day5InheritanceExample {
    public static void main(String[] args) {

        Student s1 = new Student();


        Student.count++;
        s1.count++;

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";

        try {
            Date s1BirthDate = sdf.parse(dateInString);
            s1.setDateOfBirth(s1BirthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Faculty f1=new Faculty();

        s1.setCourseName("Mobile Application Development Technology");
        s1.setPercentage(78);

    }
}
