package practice.lijx.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test () {
        return "test";
    }

    @RequestMapping("/hello")
    public String hello () {
        return "hello";
    }
}
