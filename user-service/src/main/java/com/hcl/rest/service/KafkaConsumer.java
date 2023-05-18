package com.hcl.rest.service;import com.hcl.rest.domain.UserDto;
import java.security.Provider.Service;
@Service
public class KafkaConsumer {
    @KafkaListener(topics = "userupdate")
    public void consumeMessage(UserDto userDto) {
        // Update user status
    }
}