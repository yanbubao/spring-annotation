package april.spring.project.service;

import april.spring.project.dao.MyDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanzx
 */
@Service
public class MyService {
    //@Qualifier("dao")
    @Resource
    //@Autowired
    private MyDao myDao;

    public void print(){
        System.out.println(myDao);
    }
}
