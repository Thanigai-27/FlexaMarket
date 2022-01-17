package com.example.flexa.model;

import javax.persistence.*;

@Entity
@Table(name = "WeightUnit")
public class WeightUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name = "abbreviation")
    private String abbreviation;
    @Column(name ="defaultValue")
    private  String defaultValue;

    public WeightUnit(Long id, String name, String abbreviation, String defaultValue) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.defaultValue = defaultValue;
    }

    public WeightUnit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
