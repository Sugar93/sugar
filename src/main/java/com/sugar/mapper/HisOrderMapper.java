package com.sugar.mapper;

import com.sugar.model.HisOrder;

public interface HisOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(HisOrder record);

    int insertSelective(HisOrder record);

    HisOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(HisOrder record);

    int updateByPrimaryKey(HisOrder record);
}