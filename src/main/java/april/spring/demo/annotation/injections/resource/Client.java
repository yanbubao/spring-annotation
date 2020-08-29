package april.spring.demo.annotation.injections.resource;

import april.spring.project.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        MyService service = app.getBean(MyService.class);
        service.print();
    }
}
