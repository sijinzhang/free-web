package com.sijin.free.web.common.domain;

/**
 * Created by sijinzhang on 16/8/30.
 */
public class DockRealTime {
    private String name;

    private String code;

    private Double sPrice;

    private Double yesterdayprice;

    private Double price;

    private Double hPrice;

    private Double lPrice;

    private String time;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getsPrice() {
        return sPrice;
    }

    public void setsPrice(Double sPrice) {
        this.sPrice = sPrice;
    }

    public Double getYesterdayprice() {
        return yesterdayprice;
    }

    public void setYesterdayprice(Double yesterdayprice) {
        this.yesterdayprice = yesterdayprice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double gethPrice() {
        return hPrice;
    }

    public void sethPrice(Double hPrice) {
        this.hPrice = hPrice;
    }

    public Double getlPrice() {
        return lPrice;
    }

    public void setlPrice(Double lPrice) {
        this.lPrice = lPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
