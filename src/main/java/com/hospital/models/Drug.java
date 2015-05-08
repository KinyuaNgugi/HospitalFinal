package com.hospital.models;

import javax.persistence.*;

/**
 * Created by kinyua on 5/7/15.
 */
@Entity
@Table(name="drugs")
public class Drug {
    @Id
    @GeneratedValue

    @Column(name = "did")
    private int id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "drug_name")
    private String dname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDName() { return dname;}

    public void setDName(String dname) {this.dname = dname;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
