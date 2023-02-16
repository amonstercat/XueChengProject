package com.xuecheng.content.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration    //声明该类为配置类，最终交给spring容器管理
@MapperScan("com.xuecheng.content.mapper")  //声明被扫描mapper的路径
public class MybatisPlusConfig {

    //定义分页拦截器
    @Bean
    public MybatisPlusInterceptor getMybatisPlusInterceptor()
    {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        //对指定数据库添加分页拦截
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return mybatisPlusInterceptor;
    }
}
