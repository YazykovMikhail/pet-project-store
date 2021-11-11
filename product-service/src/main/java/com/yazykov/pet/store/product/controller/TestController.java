package com.yazykov.pet.store.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RefreshScope
public class TestController {

    //для обновления свойств в конкретном микросервисе
    //http://host:port/actuator/refresh
    //Если подключено Cloud.start.bus.amqp то можно обновить сразу все микросервисы
    //http://host:port/actuator/busrefresh

    @Value("${test.name}")
    private String name;

    @GetMapping
    public String test() {
        return name;
    }
}
