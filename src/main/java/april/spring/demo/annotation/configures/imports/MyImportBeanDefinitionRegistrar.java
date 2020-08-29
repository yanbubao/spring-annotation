package april.spring.demo.annotation.configures.imports;

import april.spring.project.entity.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author yanzx
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param annotationMetadata     当前类的注解信息
     * @param beanDefinitionRegistry 完成BeanDefinition的注册
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {

        boolean company = beanDefinitionRegistry.containsBeanDefinition("april.spring.project.entity.Company");
        boolean member = beanDefinitionRegistry.containsBeanDefinition("april.spring.project.entity.Member");

        if (company && member) {
            BeanDefinition beanDefinition = new RootBeanDefinition(User.class);
            beanDefinitionRegistry.registerBeanDefinition("user", beanDefinition);
        }
    }
}
