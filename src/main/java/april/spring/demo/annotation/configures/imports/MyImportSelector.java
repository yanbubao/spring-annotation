package april.spring.demo.annotation.configures.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author yanzx
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"april.spring.project.entity.Member",
                "april.spring.project.entity.Company"};
    }
}
