package com.hcl.rest.service;import com.hcl.rest.domain.UserDto;import com.hcl.rest.entity.User;import com.hcl.rest.repository.UserRepository;import java.security.Provider.Service;
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