package com.example.Relation._to1.Entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    @Column
    private String eName;

    @Column
    private int eAge;

    @OneToOne(cascade =CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "Addess_Id")
    private Address Adress;

    public Employee()
    {
    }

    public Employee(String eName, int eAge) {
        this.eName = eName;
        this.eAge=eAge;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public Address getAdress() {
        return Adress;
    }

    public void setAdress(Address adress) {
        Adress = adress;
    }
}
