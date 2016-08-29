package com.sijin.free.web.common.domain;

public class RedSoldier {
    private Long id;

    private String code;

    private String name;

    private Double price;

    private Double price3;

    private Double price2;

    private Double price1;

    private Long updated;

    private Long  created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice3() {
        return price3;
    }

    public void setPrice3(Double price3) {
        this.price3 = price3;
    }

    public Double getPrice2() {
        return price2;
    }

    public void setPrice2(Double price2) {
        this.price2 = price2;
    }

    public Double getPrice1() {
        return price1;
    }

    public void setPrice1(Double price1) {
        this.price1 = price1;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Long getcreated() {
        return  created;
    }

    public void setcreated(Long  created) {
        this. created =  created;
    }
}