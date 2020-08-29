package april.spring.demo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        Object person = xmlApplicationContext.getBean("personFromXml");
        System.out.println(person);
    }
}
