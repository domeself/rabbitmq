package com.redapplenet.rabbitmq.receiver;

import com.redapplenet.rabbitmq.configuration.RabbitmqConfig;
import com.redapplenet.rabbitmq.pojo.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = {RabbitmqConfig.QUEUE})
    public void receiverDirectQueue(User user) {
        System.out.println("【receiverDirectQueue监听到消息】" + user.toString());
    }

}
