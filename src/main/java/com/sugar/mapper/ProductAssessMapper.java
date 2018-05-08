package com.sugar.mapper;

import com.sugar.model.ProductAssess;

public interface ProductAssessMapper {
    int deleteByPrimaryKey(Long assessId);

    int insert(ProductAssess record);

    int insertSelective(ProductAssess record);

    ProductAssess selectByPrimaryKey(Long assessId);

    int updateByPrimaryKeySelective(ProductAssess record);

    int updateByPrimaryKeyWithBLOBs(ProductAssess record);

    int updateByPrimaryKey(ProductAssess record);
}