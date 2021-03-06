package april.spring.demo.annotation.configures.conditional;

import april.spring.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanzx
 */
@Configuration
public class MyConfig {

    @Conditional(WindowsCondition.class)
    @Bean
    public Person mic() {
        System.out.println("将对象Mic添加到IoC容器中");
        return new Person("Mic", 16);
    }

    @Conditional(WindowsCondition.class)
    @Bean
    public Person tom() {
        System.out.println("将对象Tom添加到IoC容器中");
        return new Person("Tom", 18);
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public Person james() {
        System.out.println("将对象James添加到IoC容器中");
        return new Person("James", 17);
    }
}
