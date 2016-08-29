package com.sijin.free.web.common.domain;

public class DockInfo {
    private Long id;

    private String code;

    private String name;

    private Double mywantbuy;

    private Double mywantsale;

    private Long updated;

    private Long created;

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

    public Double getMywantbuy() {
        return mywantbuy;
    }

    public void setMywantbuy(Double mywantbuy) {
        this.mywantbuy = mywantbuy;
    }

    public Double getMywantsale() {
        return mywantsale;
    }

    public void setMywantsale(Double mywantsale) {
        this.mywantsale = mywantsale;
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