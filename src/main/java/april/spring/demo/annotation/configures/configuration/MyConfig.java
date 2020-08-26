package april.spring.demo.annotation.configures.configuration;

import april.spring.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanzx
 */
@Configuration
public class MyConfig {
    @Bean
    public Person person1() {
        return new Person("Tom", 18);
    }
}
