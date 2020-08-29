package april.spring.project.service;

import april.spring.project.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yanzx
 */
@Service
public class MyService {
    //@Qualifier("dao")
//    @Resource(name="dao")
    @Autowired
    private MyDao myDao;

    public void print(){
        System.out.println(myDao);
    }
}
