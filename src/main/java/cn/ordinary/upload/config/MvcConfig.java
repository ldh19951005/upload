package cn.ordinary.upload.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ordinary
 * @date 2019/12/24
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Value("${webvalue.resourcePath}")
    private String folderPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/**").addResourceLocations("file:" + folderPath);
    }
}
