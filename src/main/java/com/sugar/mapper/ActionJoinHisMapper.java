package com.sugar.mapper;

import com.sugar.model.ActionJoinHis;

public interface ActionJoinHisMapper {
    int deleteByPrimaryKey(Long joinId);

    int insert(ActionJoinHis record);

    int insertSelective(ActionJoinHis record);

    ActionJoinHis selectByPrimaryKey(Long joinId);

    int updateByPrimaryKeySelective(ActionJoinHis record);

    int updateByPrimaryKey(ActionJoinHis record);
}