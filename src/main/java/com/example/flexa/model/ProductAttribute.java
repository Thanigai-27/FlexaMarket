package com.example.flexa.model;

import javax.persistence.*;

@Entity
@Table(name = "ProductAttribute")
public class ProductAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "attributeName")
    private String attributeName;
    @Column(name = "attributeDescription")
    private String attributeDescription;

    public ProductAttribute(){}

    public ProductAttribute(Long id, String attributeName, String attributeDescription) {
        this.id = id;
        this.attributeName = attributeName;
        this.attributeDescription = attributeDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeDescription() {
        return attributeDescription;
    }

    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }
}
