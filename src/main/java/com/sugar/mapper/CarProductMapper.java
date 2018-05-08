package com.sugar.mapper;

import com.sugar.model.CarProduct;

public interface CarProductMapper {
    int deleteByPrimaryKey(Long orderProductId);

    int insert(CarProduct record);

    int insertSelective(CarProduct record);

    CarProduct selectByPrimaryKey(Long orderProductId);

    int updateByPrimaryKeySelective(CarProduct record);

    int updateByPrimaryKey(CarProduct record);
}