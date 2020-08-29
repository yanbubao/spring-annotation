package april.spring.demo.annotation.configures.imports;

import april.spring.project.entity.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author yanzx
 */
public class MonkeyFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
