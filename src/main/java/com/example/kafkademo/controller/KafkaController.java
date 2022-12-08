package com.example.kafkademo.controller;

import com.example.kafkademo.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("/publishmessage")
    public String producer(@RequestParam ("message") String message){
        System.out.println(message);
        kafkaProducer.send(message);
         System.out.println("change in onkar_dev from github");

        return "message send to kafkatopic successfull";
    }
}
