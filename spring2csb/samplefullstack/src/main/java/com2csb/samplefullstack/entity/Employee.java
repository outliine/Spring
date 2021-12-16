package com2csb.samplefullstack.entity;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;


@Entity
@Table(name = "tbl_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String  name;
    private String location;
    private String department;

    public Employee() {
    }

    public Employee(long employeeId, String name, String location, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
