package cn.tycoding.controller;

import cn.tycoding.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tycoding
 * @date 2019-03-22
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer/{name}")
    public String hello(@PathVariable("name") String name) {
        return consumerService.hello(name);
    }
}
