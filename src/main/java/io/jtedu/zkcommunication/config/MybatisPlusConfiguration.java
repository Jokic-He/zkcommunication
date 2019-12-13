package io.jtedu.zkcommunication.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * mp配置<p>
 *
 * @author hepeiyun
 * @since 2019/12/13
 */
@Configuration
@MapperScan({"io.jtedu.zkcommunication.module.**.dao.**"})
public class MybatisPlusConfiguration {

    public MybatisPlusConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean({PaginationInterceptor.class})
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置方言
        paginationInterceptor.setDialectType("mysql");
        return paginationInterceptor;
    }

    @Bean
    @Profile({"dev", "test"})
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
}
