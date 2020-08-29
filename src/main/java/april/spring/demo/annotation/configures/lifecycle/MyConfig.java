package april.spring.demo.annotation.configures.lifecycle;

import april.spring.project.entity.Car;
import org.springframework.context.annotation.*;

/**
 * 对Bean生命周期的监控：
 * a.配置@Bean的参数 initMethod和destroyMethod
 * b.bean分别实现 InitializingBean 和 DisposableBean接口
 * c.使用@PostConstruct、@PreDestroy
 * d.自定义类实现BeanPostProcessor接口
 *
 * @author yanzx
 */
@Configuration
@ComponentScans({
        @ComponentScan("april.spring.project.entity"),
        @ComponentScan("april.spring.demo.annotation.configures.lifecycle")})
public class MyConfig {

    @Lazy
    @Bean(initMethod = "addOil", destroyMethod = "close")
    public Car car() {
        return new Car();
    }
}
