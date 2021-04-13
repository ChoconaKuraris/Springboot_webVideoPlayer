package com.eow.education;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ClassUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
//建立tomcat虚拟路径
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //sourcePath 是获取resources文件夹的绝对地址
        String sourcePath = ClassUtils.getDefaultClassLoader().getResource("").getPath().substring(1);
        String VideoPath = sourcePath +"static/video/";
        String PosterPath = sourcePath +"static/images/poster/";
        registry.addResourceHandler("/posters/**").addResourceLocations("file:"+PosterPath);
        registry.addResourceHandler("/videos/**").addResourceLocations("file:"+VideoPath);
    }
}
