package april.spring.demo.annotation.injections.resource;

import april.spring.project.dao.MyDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

    @Bean("dao")
    public MyDao dao() {
        MyDao dao = new MyDao();
        dao.setFlag("4");
        return dao;
    }
}
