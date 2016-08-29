package com.sijin.free.web.common.domain;

public class Codes {
    private Long id;

    private String code;

    private String name;

    private Integer followLevel;

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

    public Integer getFollowLevel() {
        return followLevel;
    }

    public void setFollowLevel(Integer followLevel) {
        this.followLevel = followLevel;
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

    @Override
    public String toString() {
        return "Codes{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", followLevel=" + followLevel +
                ", updated=" + updated +
                ", created=" + created +
                '}';
    }
}
