package april.spring.demo.annotation.configures.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * includeFilters 用于指定只扫描谁！
 *
 * @author yanzx
 * @Controller、@Service等注解都是@Component子类
 */
@Configuration
@ComponentScan(value = "april.spring.project",
        //includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Component.class})},
        //includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})},
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = MyTypeFilter.class)},
        useDefaultFilters = false)
public class MyConfig {
}
