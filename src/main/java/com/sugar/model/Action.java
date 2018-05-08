package com.sugar.model;

import java.util.Date;

public class Action {
    private Long actionId;

    private String actionName;

    private Date actionStateTime;

    private Date actionEndTime;

    private String actionLoaderId;

    private String actionLoaderName;

    private Date createTime;

    private Date updateTime;

    private Byte state;

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public Date getActionStateTime() {
        return actionStateTime;
    }

    public void setActionStateTime(Date actionStateTime) {
        this.actionStateTime = actionStateTime;
    }

    public Date getActionEndTime() {
        return actionEndTime;
    }

    public void setActionEndTime(Date actionEndTime) {
        this.actionEndTime = actionEndTime;
    }

    public String getActionLoaderId() {
        return actionLoaderId;
    }

    public void setActionLoaderId(String actionLoaderId) {
        this.actionLoaderId = actionLoaderId == null ? null : actionLoaderId.trim();
    }

    public String getActionLoaderName() {
        return actionLoaderName;
    }

    public void setActionLoaderName(String actionLoaderName) {
        this.actionLoaderName = actionLoaderName == null ? null : actionLoaderName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}