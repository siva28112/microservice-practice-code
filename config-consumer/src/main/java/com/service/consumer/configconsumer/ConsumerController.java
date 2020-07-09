package com.service.consumer.configconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConsumerController {

    @Autowired
    Environment environment;

    @GetMapping("/consumer")
    public String getConsumer(){
        return environment.getProperty("vehicle.default.model");
    }
}
