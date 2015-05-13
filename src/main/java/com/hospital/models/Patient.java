package com.hospital.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by derric on 5/5/15.
 */

@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue

    @Column(name = "pid")
    private int id;
    
    @Column(name = "first_name")
    private String fname;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "dob")
    private String dob;

    //entity mapping
    @OneToMany(cascade =CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "patient")
    private List<Drug> drug;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() { return dob;}

    public void setDob(String dob) { this.dob = dob; }
}