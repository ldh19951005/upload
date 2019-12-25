package cn.ordinary.upload.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ordinary
 * @date 2019/12/24
 */

@Data
@Component
@ConfigurationProperties(prefix = "webvalue")
public class WebValue {
    private String resourcePath;
}
