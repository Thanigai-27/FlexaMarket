package com.example.flexa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "productID")
private Product product;
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Column(name = "slug")
    private String slug;
    @Column(name = "parent")
    private String parent;
    @Column(name = "isActive")
    private Boolean isActive;

    public Category(){

    }

    public Category(Long id, String slug, String parent, Boolean isActive) {
        this.id = id;

        this.slug = slug;
        this.parent = parent;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
