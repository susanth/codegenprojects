package com.hcl.rest.service;import com.hcl.rest.domain.UserDto;
import java.security.Provider.Service;
@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, UserDto> kafkaTemplate;
    
    public void sendMessage(String topic, UserDto userDto) {
        kafkaTemplate.send(topic, userDto);
    }
}