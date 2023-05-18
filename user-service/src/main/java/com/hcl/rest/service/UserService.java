package com.hcl.rest.service;import com.hcl.rest.domain.UserDto;
import com.hcl.rest.entity.User;
import com.hcl.rest.repository.UserRepository;
import java.security.Provider.Service;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private KafkaProducer kafkaProducer;
    
    public UserDto updateUserStatus(UserDto userDto) {
        User user = userRepository.findById(userDto.getA()).orElse(null);
        if (user != null) {
            user.setStatus(userDto.getStatus());
            userRepository.save(user);
            kafkaProducer.sendMessage("userupdate", userDto);
        }
        return userDto;
    }
}