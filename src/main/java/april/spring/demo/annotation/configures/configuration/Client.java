package april.spring.demo.annotation.configures.configuration;

import april.spring.project.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {

        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object bean = app.getBean("person1");
        System.out.println(bean);

        String [] beanNames = app.getBeanNamesForType(Person.class);
        System.out.println(Arrays.toString(beanNames));

    }
}
