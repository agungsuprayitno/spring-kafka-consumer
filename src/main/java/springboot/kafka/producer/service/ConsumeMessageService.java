package springboot.kafka.producer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessageService {
    @KafkaListener(topics = "kafka-spring-topic", groupId = "group-spring-consumer")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group spring consumer: " + message);
    }
}
