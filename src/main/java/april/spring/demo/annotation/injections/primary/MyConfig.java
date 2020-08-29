package april.spring.demo.annotation.injections.primary;

import april.spring.project.dao.MyDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author yanzx
 */
@Configuration
@ComponentScan({
        "april.spring.project.controller",
        "april.spring.project.service",
        "april.spring.project.dao"
})
public class MyConfig {
    @Bean("myDao")
    public MyDao myDao(){
        MyDao dao = new MyDao();
        dao.setFlag("3");
        return dao;
    }

    @Primary
    @Bean("myDao")
    public MyDao dao(){
        MyDao dao = new MyDao();
        dao.setFlag("9");
        return dao;
    }



}
