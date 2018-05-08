package com.sugar.controller;

import com.sugar.constants.ResponseConstants;
import com.sugar.mapper.ProductMapper;
import com.sugar.model.Product;
import com.sugar.util.Response;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: chensj
 * @Date: 2018/3/2 下午4:10
 */
@RestController
@RequestMapping("/product")
public class ProdoctController {
    private static Logger log = LoggerFactory.getLogger(ProdoctController.class);
    @Autowired
    private ProductMapper productMapper;

    @ApiOperation(value="获取产品详细信息", notes="根据产品的id来获取产品详细信息")
    @ApiImplicitParam(name = "id", value = "产品ID", required = true, dataType = "long", paramType = "path")
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public Response<Product> queryProductDetail(@PathVariable("id") long id){
        Response<Product> response = new Response<>(ResponseConstants.SUCCESS_TRUE,ResponseConstants.RESULT_CODE_SUCCESS,ResponseConstants.RESULT_MESSAGE_SUCCESS);
        log.info("入参====="+id);
        try {
            Product product = productMapper.selectByPrimaryKey(id);
            response.setResult(product);
        }catch (Exception e){
            response = new Response<>(ResponseConstants.SUCCESS_FALSE,ResponseConstants.RESULT_CODE_FAIL,ResponseConstants.RESULT_MESSAGE_FAIL);
            response.setInfo(e.getMessage());
        }
        return response;
    }
}
