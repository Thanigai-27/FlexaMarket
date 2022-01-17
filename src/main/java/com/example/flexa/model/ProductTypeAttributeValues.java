package com.example.flexa.model;

import javax.persistence.*;

@Entity
@Table(name = "ProductTypeAttributeValues")
public class ProductTypeAttributeValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "productType")
    private ProductType productType;
    @ManyToOne(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    @JoinColumn(name = "attributeValue")
    private ProductAttributeValue productAttributeValue;
    @Column(name = "sequence")
    private String sequence;

    public ProductTypeAttributeValues(){}

    public ProductTypeAttributeValues(Long id, ProductType productType, ProductAttributeValue productAttributeValue, String sequence) {
        this.id = id;
        this.productType = productType;
        this.productAttributeValue = productAttributeValue;
        this.sequence = sequence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductAttributeValue getProductAttributeValue() {
        return productAttributeValue;
    }

    public void setProductAttributeValue(ProductAttributeValue productAttributeValue) {
        this.productAttributeValue = productAttributeValue;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
