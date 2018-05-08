package com.sugar.model;

import java.util.Date;

public class ActionJoinHis {
    private Long joinId;

    private Long actionId;

    private String joinPerId;

    private String joinPerName;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private Byte state;

    public Long getJoinId() {
        return joinId;
    }

    public void setJoinId(Long joinId) {
        this.joinId = joinId;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public String getJoinPerId() {
        return joinPerId;
    }

    public void setJoinPerId(String joinPerId) {
        this.joinPerId = joinPerId == null ? null : joinPerId.trim();
    }

    public String getJoinPerName() {
        return joinPerName;
    }

    public void setJoinPerName(String joinPerName) {
        this.joinPerName = joinPerName == null ? null : joinPerName.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}