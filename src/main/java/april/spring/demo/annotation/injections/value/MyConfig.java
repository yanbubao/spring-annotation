package april.spring.demo.annotation.injections.value;

import april.spring.project.entity.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过@Value给属性赋值
 * 支持的类型：
 * 1、基本数据类型
 * 2、Spring EL表达式
 * 3、通过配置文件赋值
 *
 * @author yanzx
 */
@Configuration
public class MyConfig {

    @Bean
    public Bird bird() {
        return new Bird();
    }

}
