package com.qingcheng.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qingcheng.dao.BrandMapper;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName BrandServiceImpl
 * @Description TODO
 * @Author guanxin
 * @Date 2020/5/10 10:36
 * @Version 1.0
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;


    /*
     * @Author guanxin
     * @Description 查询所有品牌信息
     * @Date 10:28 2020/5/10
     * @Param []
     * @return java.util.List<com.qingcheng.pojo.goods.Brand>
     **/
    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }
}
