package myPackage.boot.config;/*
 *ClassName:WebConfig
 *Package:myPackage.boot.config
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/25-12:51
 *Version:v1.0
 */

import myPackage.boot.interceptor.LoginInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@MapperScan("myPackage/boot/mapper")
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login");
    }
}
