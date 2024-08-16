package com.kafka.SpringBootKafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic galaxyTopic(){
        return TopicBuilder.name("galaxy").build();
    }

    @Bean
    public NewTopic galaxyJsonTopic(){
        return TopicBuilder.name("galaxy_json").build();
    }
}
