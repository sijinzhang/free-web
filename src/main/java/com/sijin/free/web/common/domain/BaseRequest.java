package com.sijin.free.web.common.domain;

import java.util.Date;

/**
 * Author tuijiang
 * Date 16/4/12
 */
public class BaseRequest {
    private String beginDateParam;
    private String endDateParam;

    private int pagePerSize;
    private int page;

    private long cityId;//站点id
    private int type;//约编爬
    private Date beginDate;
    private Date endDate;

    private int belongto;//站内,站外
    private String content;//搜索框内容

    private int orderbyDataValue;//排序变量

    public BaseRequest() {

        this.pagePerSize = 30;
    }

    public String getBeginDateParam() {
        return beginDateParam;
    }

    public void setBeginDateParam(String beginDateParam) {
        this.beginDateParam = beginDateParam;
    }

    public String getEndDateParam() {
        return endDateParam;
    }

    public void setEndDateParam(String endDateParam) {
        this.endDateParam = endDateParam;
    }

    public int getPagePerSize() {
        return pagePerSize;
    }

    public void setPagePerSize(int pagePerSize) {
        this.pagePerSize = pagePerSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getBelongto() {
        return belongto;
    }

    public void setBelongto(int belongto) {
        this.belongto = belongto;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOrderbyDataValue() {
        return orderbyDataValue;
    }

    public void setOrderbyDataValue(int orderbyDataValue) {
        this.orderbyDataValue = orderbyDataValue;
    }
}
