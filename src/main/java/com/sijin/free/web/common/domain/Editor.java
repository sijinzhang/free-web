package com.sijin.free.web.common.domain;

/**
 * Author tuijiang
 * Date 16/4/12
 */
public class Editor {
    private long id;
    private  String date;
    private long publisherId;
    private String publishName;
    private long bloggerId;
    private  String bloggerName;
    private  int bloggerType;
    private int belongto;
    private int sourceType;
    private long offlineCnt;
    private long pushcheckCnt;
    private long checkfailedCnt;
    private long checksuccessCnt;
    private long pushpredictorCnt;
    private long onlineCnt;
    private long unknowCnt;

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

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public long getBloggerId() {
        return bloggerId;
    }

    public void setBloggerId(long bloggerId) {
        this.bloggerId = bloggerId;
    }

    public String getBloggerName() {
        return bloggerName;
    }

    public void setBloggerName(String bloggerName) {
        this.bloggerName = bloggerName;
    }

    public int getBloggerType() {
        return bloggerType;
    }

    public void setBloggerType(int bloggerType) {
        this.bloggerType = bloggerType;
    }

    public int getBelongto() {
        return belongto;
    }

    public void setBelongto(int belongto) {
        this.belongto = belongto;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public long getOfflineCnt() {
        return offlineCnt;
    }

    public void setOfflineCnt(long offlineCnt) {
        this.offlineCnt = offlineCnt;
    }

    public long getPushcheckCnt() {
        return pushcheckCnt;
    }

    public void setPushcheckCnt(long pushcheckCnt) {
        this.pushcheckCnt = pushcheckCnt;
    }

    public long getCheckfailedCnt() {
        return checkfailedCnt;
    }

    public void setCheckfailedCnt(long checkfailedCnt) {
        this.checkfailedCnt = checkfailedCnt;
    }

    public long getChecksuccessCnt() {
        return checksuccessCnt;
    }

    public void setChecksuccessCnt(long checksuccessCnt) {
        this.checksuccessCnt = checksuccessCnt;
    }

    public long getPushpredictorCnt() {
        return pushpredictorCnt;
    }

    public void setPushpredictorCnt(long pushpredictorCnt) {
        this.pushpredictorCnt = pushpredictorCnt;
    }

    public long getOnlineCnt() {
        return onlineCnt;
    }

    public void setOnlineCnt(long onlineCnt) {
        this.onlineCnt = onlineCnt;
    }

    public long getUnknowCnt() {
        return unknowCnt;
    }

    public void setUnknowCnt(long unknowCnt) {
        this.unknowCnt = unknowCnt;
    }
}
