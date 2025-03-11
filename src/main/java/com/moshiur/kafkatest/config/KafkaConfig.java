package com.moshiur.kafkatest.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic moshiurTopic(){
        return TopicBuilder.name("moshiur-01")
                .build();
    }
}
