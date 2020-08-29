package april.spring.demo.annotation.configures.scope;

import april.spring.project.entity.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 1、prototype 多例
 * 2、singleton 单例
 * 3、request 主要应用于web模块，同一次请求只创建一个实例
 * 4、session 主要应用于web模块，同一个session只创建一个实例
 *
 * @author yanzx
 */
@Configuration
public class MyConfig {

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public Person personScope() {
        return new Person("scopeBean", 25);
    }
}
