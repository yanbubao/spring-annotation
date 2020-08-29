package april.spring.demo.annotation.configures.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("IOC容器创建完成！");
        System.out.println(context.getBean("person"));
    }
}
