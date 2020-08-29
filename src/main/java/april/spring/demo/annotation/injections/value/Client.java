package april.spring.demo.annotation.injections.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean("bird"));
    }
}
