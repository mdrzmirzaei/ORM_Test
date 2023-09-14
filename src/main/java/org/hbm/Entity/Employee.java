package org.hbm.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(length = 25)
    private String fname;
    @Column(length = 35)
    private String lname;

    @Column(length = 10)
    private String nationalCode;

    public Employee() {

    }


    public Employee(String fname, String lname, String nationalCode) {
        this.fname = fname;
        this.lname = lname;
        this.nationalCode = nationalCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
