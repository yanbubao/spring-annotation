package april.spring.demo.annotation.configures.lifecycle;

import april.spring.project.entity.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("IOC容器创建完成！");
        Car car = (Car) context.getBean("car");
        car.run();

        System.out.println("*********************************");
        System.out.println(context.getBean("train"));

        System.out.println("*********************************");
        System.out.println(context.getBean("airPlane"));

        context.close();
    }
}
