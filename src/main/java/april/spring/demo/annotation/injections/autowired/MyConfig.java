package april.spring.demo.annotation.injections.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配 Injection Components
 *
 * @author yanzx
 * @Component 泛指组件，当组件不好归类时可以用它
 * @Service、@Controller、@Repository
 * @Value 基本数据类型赋值、String、Spring的EL表达式
 * @Autowired 默认按类型装配，如果想按名称装配，需要配合@Qualifier使用
 * @PropertySource 读取配置文件赋值，如@PropertySource("classpath:value.properties")，成员变量再使用@Value("${user.name}")进行赋值
 * @Qualifier 如存在多个实例配合使用，优先级高于@Autowired
 * @Primary 自动装配出现多个Bean的候选者时，被注解为@Primary的bean将作为首选者，否则抛出异常
 * @Resource 默认按名称装配，当找不到与名称匹配的bean时才会按类型装配，优先级高于@Autowired和@Quafilier
 */
@Configuration
@ComponentScan({
        "april.spring.project.controller",
        "april.spring.project.service",
        "april.spring.project.dao"
})
public class MyConfig {

}
