package com.sugar.mapper;

import com.sugar.model.ActionHis;

public interface ActionHisMapper {
    int deleteByPrimaryKey(Long actionId);

    int insert(ActionHis record);

    int insertSelective(ActionHis record);

    ActionHis selectByPrimaryKey(Long actionId);

    int updateByPrimaryKeySelective(ActionHis record);

    int updateByPrimaryKey(ActionHis record);
}