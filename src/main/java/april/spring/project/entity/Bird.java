package april.spring.project.entity;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author yanzx
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Bird {

    @Value("大鸟")
    private String name;

    @Value("#{8-5}")
    private int age;

    @Value("${bird.color}")
    private String color;
}
