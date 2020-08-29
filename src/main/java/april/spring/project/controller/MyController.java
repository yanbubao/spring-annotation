package april.spring.project.controller;

import april.spring.project.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author yanzx
 */
@Controller
public class MyController {
    @Autowired
    private MyService service;
}
