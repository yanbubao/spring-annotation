package april.spring.demo.annotation.injections.propertysource;

import april.spring.project.entity.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author yanzx
 */
@Configuration
@PropertySource("classpath:values.properties")
public class MyConfig {
    @Bean
    public Bird bird() {
        return new Bird();
    }
}
