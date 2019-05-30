package com.gurwinder;

import com.gurwinder.college.Faculty;
import com.gurwinder.college.Person;
import com.gurwinder.college.Student;
import com.gurwinder.hardware.Desktop;
import sun.security.krb5.internal.crypto.Des;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day5InheritanceExample {
    int y;
    static int p;
    {
        y=100;
        int a =200;
        System.out.println("first blockkkkkkkkkkkkkkkkkkk");
        //static int l0=34;//cant do that
    }

    static{
        p=1000;

        System.out.println("second blockkkkkkkkkkkkkkkk");
      //  y=3000;

    }


    public static void main(String[] args) {

      /*  Student s1 = new Student();

        Desktop d=new Desktop();
        Desktop d2= new Desktop("Keyboard","Screen");
        *//*Day5InheritanceExample D= new Day5InheritanceExample();

        Student.count++;
        s1.count++;*//*

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
        s1.setPercentage(78);*/

        Person p;
        Student s1 = new Student();
        p=s1;
        ((Student) p).setCourseName("");
    }
}
