package com.example.flexa.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="ProductInventory")
public class ProductInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="sku")
    private String sku;
    @Column(name = "upc")
    private String upc;
@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "productTypeId")
    private ProductType productType;
@ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "product")
    private Product product;
@Column(name = "rrPrice")
    private Long rrPrice;
@Column(name = "storePrice")
    private Long storePrice;
@Column(name = "salePrice")
    private Long salePrice;
@Column(name = "inStock")
    private Long inStock;
@Column(name = "weight")
    private Long weight;
@ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "brand")
    private Brand brand;
@Column(name = "createdAt")
    private Timestamp createdAt;
@Column(name = "updatedAt")
    private Timestamp updatedAt;
@Column(name = "isActive")
    private Boolean isActive;

    public ProductInventory(){}

    public ProductInventory(Long id, String sku, String upc, ProductType productType, Product product, Long rrPrice, Long storePrice, Long salePrice, Long inStock, Long weight, Brand brand, Timestamp createdAt, Timestamp updatedAt, Boolean isActive) {
        this.id = id;
        this.sku = sku;
        this.upc = upc;
        this.productType = productType;
        this.product = product;
        this.rrPrice = rrPrice;
        this.storePrice = storePrice;
        this.salePrice = salePrice;
        this.inStock = inStock;
        this.weight = weight;
        this.brand = brand;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getRrPrice() {
        return rrPrice;
    }

    public void setRrPrice(Long rrPrice) {
        this.rrPrice = rrPrice;
    }

    public Long getStorePrice() {
        return storePrice;
    }

    public void setStorePrice(Long storePrice) {
        this.storePrice = storePrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Long getInStock() {
        return inStock;
    }

    public void setInStock(Long inStock) {
        this.inStock = inStock;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
