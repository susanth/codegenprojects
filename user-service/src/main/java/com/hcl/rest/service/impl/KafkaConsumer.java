package com.hcl.rest.service.impl;
@Component
public class KafkaConsumer {
    @KafkaListener(topics = "userupdate")
    public void consumeMessage(User user) {
        // Update user status
    }
}