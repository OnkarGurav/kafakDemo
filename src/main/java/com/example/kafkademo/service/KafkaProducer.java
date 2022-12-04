package com.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemp;

    String KafkaTopic = "kafka_Consumer_Example";

    public void send(String massage) {
        System.out.println(massage);
        kafkaTemp.send(KafkaTopic, massage);
    }
}
