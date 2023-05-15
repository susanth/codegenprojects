package com.hcl.rest.controller;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/updateUserStatus")
    public UserDto updateUserStatus(@RequestBody UserDto userDto) {
        return userService.updateUserStatus(userDto);
    }
}