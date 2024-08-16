package com.kafka.SpringBootKafka.kafka;

import com.kafka.SpringBootKafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics="galaxy_json", groupId = "myGroup")
    public void consume(User user){

        LOGGER.info(String.format("Json Message received -> %s",user.toString()));
    }
}
