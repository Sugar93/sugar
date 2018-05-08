package com.sugar.mapper;

import com.sugar.model.ActionJoin;

public interface ActionJoinMapper {
    int deleteByPrimaryKey(Long joinId);

    int insert(ActionJoin record);

    int insertSelective(ActionJoin record);

    ActionJoin selectByPrimaryKey(Long joinId);

    int updateByPrimaryKeySelective(ActionJoin record);

    int updateByPrimaryKey(ActionJoin record);
}