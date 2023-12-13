package com.whut.jifeixitong.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class WhutConfiguration {

    /**
     * 新增一个配置项，配置MP拦截器，程序启动注入到Spring容器中
     * 吗：配置MP自动分页
     * @return 配置MP拦截器
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration config = new CorsConfiguration();
        // 允许所有的请求头访问后端
        config.addAllowedOrigin("*");
        // 允许所有的请求方式访问后端
        config.addAllowedMethod("*");
        // 设置允许的请求头，* 表示全部允许
        config.addAllowedHeader("*");
        /**
         * CORS是一种机制，用于允许Web应用程序在一个域中访问另一个域的资源。默认情况下，浏览器限制了从一个源（域）加载的页面或脚本在另一个源（域）发起的资源请求。
         * UrlBasedCorsConfigurationSource是Spring Framework中提供的一个用于配置CORS的类。它是CorsConfigurationSource接口的实现类，用于定义跨源资源共享的配置。
         * 代码中的source.registerCorsConfiguration("/**", config)用于注册CORS配置，其中：
         * "/**"表示匹配所有的URL路径，即对所有请求都生效,config是一个CorsConfiguration对象，用于定义具体的CORS配置选项，例如允许的源（域）、允许的HTTP方法、允许的请求头等。
         * 通过使用UrlBasedCorsConfigurationSource，您可以配置CORS规则，以允许来自不同源的资源请求访问您的应用程序。这对于在跨域环境中开发Web应用程序或提供Web服务非常有用。
         */
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 匹配所有请求
        source.registerCorsConfiguration("/**",config);
        return new CorsFilter(source);
    }

    /**
     * 创建Swagger文档对象，将其注入到SpringBoot容器中
     * @return 文档对象
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.whut.sportPlay.controller"))
                .build();
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("个人健康管理系统")
                .description("个人健康管理系统的不同组成")
                .version("1.0")
                .build();
    }
}
