package zust.xyt.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author Andew
 */
@SpringBootApplication
public class SpringbootDemoApplication {

    @PostConstruct
    public void initMethod() {
        System.out.println("======init=======");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
