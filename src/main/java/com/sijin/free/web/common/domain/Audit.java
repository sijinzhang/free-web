package com.sijin.free.web.common.domain;

/**
 * Author tuijiang
 * Date 16/4/12
 */
public class Audit {
    private long id;
    private String auditUser;
    private long auditUserId;
    private String biDate;
    private int pass;
    private int unpass;
    private int hold;
    private int created;
    private int updated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }

    public long getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(long auditUserId) {
        this.auditUserId = auditUserId;
    }

    public String getBiDate() {
        return biDate;
    }

    public void setBiDate(String biDate) {
        this.biDate = biDate;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getUnpass() {
        return unpass;
    }

    public void setUnpass(int unpass) {
        this.unpass = unpass;
    }

    public int getHold() {
        return hold;
    }

    public void setHold(int hold) {
        this.hold = hold;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }
}
