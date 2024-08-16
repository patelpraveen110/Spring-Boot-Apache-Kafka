package com.kafka.SpringBootKafka.controller;

import com.kafka.SpringBootKafka.kafka.JsonKafkaProducer;
import com.kafka.SpringBootKafka.kafka.KafkaProducer;
import com.kafka.SpringBootKafka.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent to Kafka Topic");
    }
}
