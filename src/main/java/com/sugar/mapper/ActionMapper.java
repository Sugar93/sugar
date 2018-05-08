package com.sugar.mapper;

import com.sugar.model.Action;

public interface ActionMapper {
    int deleteByPrimaryKey(Long actionId);

    int insert(Action record);

    int insertSelective(Action record);

    Action selectByPrimaryKey(Long actionId);

    int updateByPrimaryKeySelective(Action record);

    int updateByPrimaryKey(Action record);
}