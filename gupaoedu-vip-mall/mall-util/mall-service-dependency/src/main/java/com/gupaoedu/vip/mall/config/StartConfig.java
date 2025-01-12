package com.gupaoedu.vip.mall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ${留白}
 * @since 2025/1/13
 */
@Configuration
public class StartConfig {

    /****
     * 分页插件(分页拦截器)，必须写拦截器，不然mp的分页功能不生效
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor pageInterceptor = new PaginationInterceptor();
        // 设置数据类型
        pageInterceptor.setDbType(DbType.MYSQL);
        return pageInterceptor;
    }
}