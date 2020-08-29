package april.spring.demo.annotation.configures.lazy;

import april.spring.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Lazy 懒加载只针对单例Bean起作用！
 *
 * @author yanzx
 */
@Configuration
public class MyConfig {

    @Lazy
    @Bean
    public Person person() {
        System.out.println("lazy package MyConfig 将对象添加到IoC容器中！");
        return new Person("yanzx", 25);
    }
}
