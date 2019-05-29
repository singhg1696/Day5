package com.gurwinder.college;

import com.gurwinder.hardware.Computer;

import java.util.Date;

public class Faculty extends Person {
    private String departmentName;
    private String designation;
    private Date joiningDate;
    private float salary;

    public Faculty() {
    }

    /**
     *
     * @param departmentName
     * @param designation
     * @param joiningDate
     * @param salary
     */
    public Faculty(String departmentName, String designation, Date joiningDate, float salary) {
        this.departmentName = departmentName;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    /**
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param gender
     * @param dateOfBirth
     * @param emailId
     * @param computer
     * @param departmentName
     * @param designation
     * @param joiningDate
     * @param salary
     */
    public Faculty(int id, String firstName, String lastName, String gender, Date dateOfBirth, String emailId, Computer computer, String departmentName, String designation, Date joiningDate, float salary) {
        super(id, firstName, lastName, gender, dateOfBirth, emailId, computer);
        this.departmentName = departmentName;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void display() {

    }

    @Override
    public void print()
    {

    }
}
