package com.consume.consume_location.config;

import com.consume.consume_location.util.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE,groupId = AppConstants.GROUP_ID)
    public void receiveLocation(String value){
        System.out.println(value);
    }
}
