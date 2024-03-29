package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

}
