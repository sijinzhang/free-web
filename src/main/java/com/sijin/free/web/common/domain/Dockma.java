package com.sijin.free.web.common.domain;

public class Dockma {
    private Long id;

    private String codes;

    private String name;

    private Double price;

    private Double lowPirce;

    private Double highPirce;

    private Double deviation;

    private Double ma5;

    private Double ma10;

    private Double ma20;

    private Double ma30;

    private Long updated;

    private Long created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes == null ? null : codes.trim();
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

    public Double getLowPirce() {
        return lowPirce;
    }

    public void setLowPirce(Double lowPirce) {
        this.lowPirce = lowPirce;
    }

    public Double getHighPirce() {
        return highPirce;
    }

    public void setHighPirce(Double highPirce) {
        this.highPirce = highPirce;
    }

    public Double getDeviation() {
        return deviation;
    }

    public void setDeviation(Double deviation) {
        this.deviation = deviation;
    }

    public Double getMa5() {
        return ma5;
    }

    public void setMa5(Double ma5) {
        this.ma5 = ma5;
    }

    public Double getMa10() {
        return ma10;
    }

    public void setMa10(Double ma10) {
        this.ma10 = ma10;
    }

    public Double getMa20() {
        return ma20;
    }

    public void setMa20(Double ma20) {
        this.ma20 = ma20;
    }

    public Double getMa30() {
        return ma30;
    }

    public void setMa30(Double ma30) {
        this.ma30 = ma30;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }
}