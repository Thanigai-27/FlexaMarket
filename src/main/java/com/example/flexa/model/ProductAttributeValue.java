package com.example.flexa.model;

import javax.persistence.*;

@Entity
@Table(name = "ProductAttributeValue")
public class ProductAttributeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "productAttribute")
    private ProductAttribute productAttribute;
    @Column(name = "attributeValue")
    private Long attributeValue;
    @Column(name = "description")
    private String description;

    public ProductAttributeValue(){}

    public ProductAttributeValue(Long id, ProductAttribute productAttribute, Long attributeValue, String description) {
        this.id = id;
        this.productAttribute = productAttribute;
        this.attributeValue = attributeValue;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(ProductAttribute productAttribute) {
        this.productAttribute = productAttribute;
    }

    public Long getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(Long attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
