package april.spring.demo.annotation.injections.autowired;

import april.spring.project.dao.MyDao;
import april.spring.project.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object controller = app.getBean("myController");
        System.out.println(controller);

        MyService service = app.getBean(MyService.class);
        service.print();

        MyDao dao = app.getBean(MyDao.class);
        System.out.println(dao);
    }
}
