package com.home.tutor.controller;

import com.home.tutor.service.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage(message);
        return "Message sent to RabbitMQ!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        //producerService.sendMessage(message);
        return "Message sent to RabbitMQ!";
    }
}
