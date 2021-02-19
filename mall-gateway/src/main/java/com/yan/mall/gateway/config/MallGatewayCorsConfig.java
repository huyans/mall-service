package com.yan.mall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * Created by huyan on 2021/2/19.
 * TIME: 14:52
 * DESC:
 */
@Configuration
public class MallGatewayCorsConfig {

    /**
     * 配置跨域
     * @return
     */
    @Bean
    public CorsWebFilter createFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration configuration = new CorsConfiguration();
        //允许所有请求头跨域
        configuration.addAllowedHeader("*");
        //允许所有方法跨域
        configuration.addAllowedMethod("*");
        //允许所有网站来源跨域
        configuration.addAllowedOrigin("*");
        //允许cookie跨域
        configuration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", configuration);
        return new CorsWebFilter(source);
    }
}
