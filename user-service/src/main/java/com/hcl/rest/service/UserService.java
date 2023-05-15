package com.hcl.rest.service;
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