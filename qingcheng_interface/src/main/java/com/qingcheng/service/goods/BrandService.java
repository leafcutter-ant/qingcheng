package com.qingcheng.service.goods;

import com.qingcheng.pojo.goods.Brand;

import java.util.List;

/**
 * @ClassName BrandService
 * @Description TODO
 * @Author guanxin
 * @Date 2020/5/10 10:36
 * @Version 1.0
 */
public interface BrandService {

    /*
     * @Author guanxin
     * @Description //查询所有品牌信息
     * @Date 10:37 2020/5/10
     * @Param []
     * @return java.util.List<com.qingcheng.pojo.goods.Brand>
     **/
    public List<Brand> findAll();
}
