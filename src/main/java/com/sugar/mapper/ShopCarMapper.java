package com.sugar.mapper;

import com.sugar.model.ShopCar;

public interface ShopCarMapper {
    int deleteByPrimaryKey(Long carId);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Long carId);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);
}