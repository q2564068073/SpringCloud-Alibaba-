package com.gupaoedu.vip.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.vip.mall.goods.model.Brand;

import java.util.List;

/**
 * @author 1
 * @since 2025/1/13
 */
public interface BrandService extends IService<Brand> {
    List<Brand> queryList(Brand brand);

    Page<Brand> queryPageList(Long currentPage, Long size, Brand brand);

}
