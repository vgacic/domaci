package com.example.demo.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "first_name")
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column
    private String position;

    /*
        Druga strana bidirekcione veze 1:n
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Department department;

    /*
        Jedan radnik može da radi na više projekata, a jedan projekat može da sadrži više radnika
        koji rade na njemu. Stavljamo anotaciju @ManyToMany.

        Anotacija @JoinTable pravi odvojenu tabelu koja će čuvati veze izmedju projekata i radnika.
        Sa name = "working" postavljamo naziv te tabele.
    */
    @ManyToMany
    @JoinTable(name = "working",
            joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))
    private Set<Project> projects = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", department=" + department +
                '}';
    }
}
