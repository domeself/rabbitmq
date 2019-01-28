package com.redapplenet.rabbitmq.sender;

import com.redapplenet.rabbitmq.configuration.RabbitmqConfig;
import com.redapplenet.rabbitmq.pojo.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendDirectQueue(String name) {
        User user = new User();
        user.setUserId("123456");
        user.setName(name);
        user.setAge(34);
        System.out.println(("【sendDirectQueue已发送消息】"));
        // 第一个参数是指要发送到哪个队列里面， 第二个参数是指要发送的内容
        this.amqpTemplate.convertAndSend(RabbitmqConfig.QUEUE, user);
    }



}
