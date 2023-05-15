package com.hcl.rest.service;
@Service
public class KafkaConsumer {
    @KafkaListener(topics = "userupdate")
    public void consumeMessage(UserDto userDto) {
        // Update user status
    }
}