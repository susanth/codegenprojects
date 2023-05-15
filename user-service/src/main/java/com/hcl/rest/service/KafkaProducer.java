package com.hcl.rest.service;
@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, UserDto> kafkaTemplate;
    
    public void sendMessage(String topic, UserDto userDto) {
        kafkaTemplate.send(topic, userDto);
    }
}