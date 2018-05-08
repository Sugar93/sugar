package com.sugar.model;

import java.util.Date;

public class User {
    private Long userId;

    private String name;

    private String wxchat;

    private Date birthday;

    private Byte gender;

    private Byte star;

    private Date createDate;

    private Date updateDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWxchat() {
        return wxchat;
    }

    public void setWxchat(String wxchat) {
        this.wxchat = wxchat == null ? null : wxchat.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Byte getStar() {
        return star;
    }

    public void setStar(Byte star) {
        this.star = star;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}