package com.example.springboottesting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@Slf4j
public class SpringbootTestingApplication {

    public static void main(String[] args) {
        log.info("Starting Spring Boot Application");
        SpringApplication.run(SpringbootTestingApplication.class, args);
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(@RequestParam(value = "name",defaultValue = "Nick") String name) {
        return String.format("test %s",name);
    }

}
