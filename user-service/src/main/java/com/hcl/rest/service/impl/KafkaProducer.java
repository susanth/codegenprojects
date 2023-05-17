package com.hcl.rest.service.impl;
@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    
    public void sendMessage(String topic, User user) {
        kafkaTemplate.send(topic, user);
    }
}