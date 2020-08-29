package april.spring.project.dao;

import org.springframework.stereotype.Repository;

/**
 * @author yanzx
 */
@Repository
public class MyDao {
    private String flag = "1";

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "MyDao{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
