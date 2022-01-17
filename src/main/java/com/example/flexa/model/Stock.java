package com.example.flexa.model;

import javax.persistence.*;

@Entity
@Table(name = "Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "productInventory")
    private ProductInventory productInventory;
    @Column(name = "lastChecked")
    private String lastChecked;
    @Column(name = "units")
    private Long units;
    @Column(name = "unitsSold")
    private Long unitsSold;

    public Stock(){}

    public Stock(Long id, ProductInventory productInventory, String lastChecked, Long units, Long unitsSold) {
        this.id = id;
        this.productInventory = productInventory;
        this.lastChecked = lastChecked;
        this.units = units;
        this.unitsSold = unitsSold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductInventory getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(ProductInventory productInventory) {
        this.productInventory = productInventory;
    }

    public String getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(String lastChecked) {
        this.lastChecked = lastChecked;
    }

    public Long getUnits() {
        return units;
    }

    public void setUnits(Long units) {
        this.units = units;
    }

    public Long getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(Long unitsSold) {
        this.unitsSold = unitsSold;
    }
}
