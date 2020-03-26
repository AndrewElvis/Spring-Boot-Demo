package zust.xyt.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AndrewElvis
 * @date 2020-03-23-15:17
 */
@RestController
@RequestMapping("/test")
public class DemoController {

    @RequestMapping("/demo")
    public String demo() {
        return "{'hello':1,'world':2}";
    }
}
