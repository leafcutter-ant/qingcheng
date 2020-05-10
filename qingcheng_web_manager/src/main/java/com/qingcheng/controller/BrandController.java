package com.qingcheng.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BrandController
 * @Description TODO
 * @Author guanxin
 * @Date 2020/5/10 10:36
 * @Version 1.0
 */

@RestController
@RequestMapping(value = "/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    /*
     * @Author guanxin
     * @Description //TODO
     * @Date 10:41 2020/5/10
     * @Param []
     * @return java.util.List<com.qingcheng.pojo.goods.Brand>
     **/
    @RequestMapping(value = "/findAll")
    public List<Brand> findAll(){
        List<Brand> brandList = brandService.findAll();
        return brandList;
    }
}
