package com.sijin.free.web.common.domain;

/**
 * Author tuijiang
 * Date 16/4/12
 */
public class Verdict {

    private long id;
    private String date;
    private long cityId;
    private String cityName;
    private long channelId;
    private String channelName;
    private String tagId;
    private int type;
    private long added;
    private long ing;
    private  long yes;
    private long no;
    private long tmp;
    private long auditDay;
    private long channelSum;
    private long yesSum;
    private long auditSum;
    private float dayAuditRate;
    private float auditRate;
    private float dayPassRate;
    private float passRate;
    private long created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getAdded() {
        return added;
    }

    public void setAdded(long added) {
        this.added = added;
    }

    public long getIng() {
        return ing;
    }

    public void setIng(long ing) {
        this.ing = ing;
    }

    public long getYes() {
        return yes;
    }

    public void setYes(long yes) {
        this.yes = yes;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public long getTmp() {
        return tmp;
    }

    public void setTmp(long tmp) {
        this.tmp = tmp;
    }

    public long getAuditDay() {
        return auditDay;
    }

    public void setAuditDay(long auditDay) {
        this.auditDay = auditDay;
    }

    public long getChannelSum() {
        return channelSum;
    }

    public void setChannelSum(long channelSum) {
        this.channelSum = channelSum;
    }

    public long getYesSum() {
        return yesSum;
    }

    public void setYesSum(long yesSum) {
        this.yesSum = yesSum;
    }

    public long getAuditSum() {
        return auditSum;
    }

    public void setAuditSum(long auditSum) {
        this.auditSum = auditSum;
    }

    public float getDayAuditRate() {
        return dayAuditRate;
    }

    public void setDayAuditRate(float dayAuditRate) {
        this.dayAuditRate = dayAuditRate;
    }

    public float getAuditRate() {
        return auditRate;
    }

    public void setAuditRate(float auditRate) {
        this.auditRate = auditRate;
    }

    public float getDayPassRate() {
        return dayPassRate;
    }

    public void setDayPassRate(float dayPassRate) {
        this.dayPassRate = dayPassRate;
    }

    public float getPassRate() {
        return passRate;
    }

    public void setPassRate(float passRate) {
        this.passRate = passRate;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
