package april.spring.demo.annotation.configures.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Object o1 = context.getBean("personScope");
        Object o2 = context.getBean("personScope");
        System.out.println(o1 == o2);
    }
}
