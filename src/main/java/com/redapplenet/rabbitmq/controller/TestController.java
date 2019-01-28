package com.redapplenet.rabbitmq.controller;

import com.redapplenet.rabbitmq.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    public String send(@RequestParam String name){
        sender.sendDirectQueue(name);
        return "success";
    }
}
