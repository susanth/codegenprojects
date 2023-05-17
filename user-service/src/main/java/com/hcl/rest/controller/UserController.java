package com.hcl.rest.controller;import com.hcl.rest.domain.UserDto;import com.hcl.rest.service.UserService;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/updateUserStatus")
    public UserDto updateUserStatus(@RequestBody UserDto userDto) {
        return userService.updateUserStatus(userDto);
    }
}