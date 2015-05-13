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

    @Column(name = "pid")
    private int pid;

    @Column(name = "drug_name")
    private String dname;

    /* Entity Mapping*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PID", insertable = false, updatable = false)
    private Patient patient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDName() { return dname;}

    public void setDName(String dname) {this.dname = dname;}

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

}
