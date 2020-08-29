package april.spring.demo.annotation.configures.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * @author yanzx
 * @Controller、@Service等注解都是@Component子类
 */
@Configuration
@ComponentScan(value = "april.spring.project",
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Component.class})},
        //includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class})},
        useDefaultFilters = false)
public class MyConfig {

}
