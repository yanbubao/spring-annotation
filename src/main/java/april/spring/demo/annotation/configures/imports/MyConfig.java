package april.spring.demo.annotation.configures.imports;

import april.spring.project.entity.Cat;
import april.spring.project.entity.Company;
import april.spring.project.entity.Member;
import april.spring.project.entity.Person;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1、使用@Import注入的类在Spring中beanName为全类名！
 * 2、实现 ImportSelector 自定义需要注入哪些bean！ 同时使用@Bean和ImportSelector会产生多个该类型的bean，Selector注的为全类名！
 * 3、实现 ImportBeanDefinitionRegistrar 自定义注入bean的逻辑！
 * 4、把需要注册bean封装为 FactoryBean！ BeanFactory负责从IOC中获取bean！FactoryBean是负责将bean注入到IOC的bean！
 *
 * @author yanzx
 */
@Configuration
@Import(value = {Cat.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MyConfig {
    @Bean
    public Company company() {
        return new Company();
    }

    @Bean
    public Member member() {
        return new Member();
    }

    @Bean
    public Person person() {
        return new Person("Tom", 18);
    }

    @Bean
    public FactoryBean<?> monkey() {
        return new MonkeyFactoryBean();
    }
}
