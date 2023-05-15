package com.hcl.rest.com.hcl.rest.service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private KafkaProducer kafkaProducer;
    
    @Override
    public UserDto updateUserStatus(User user) {
        userRepository.save(user);
        kafkaProducer.sendMessage("userupdate", user);
        return new UserDto(user);
    }
}