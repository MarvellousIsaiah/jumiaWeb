package com.Jumia.JumiaWeb.services;

import com.Jumia.JumiaWeb.data.model.User;
import com.Jumia.JumiaWeb.data.repositories.UserRepository;
import com.Jumia.JumiaWeb.dto.RegisterRequest;
import com.Jumia.JumiaWeb.dto.UserLoginRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@AllArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    public void registerRequest(RegisterRequest registerRequest) {
        if(userRepository.existsByEmail(registerRequest.getEmail()))throw new RuntimeException("not allowed");
        User user = User.builder()
                .userName(registerRequest.getUserName())
                .name(registerRequest.getName())
                .password(registerRequest.getPassword())
                .email(registerRequest.getEmail())
                .address(registerRequest.getAddress())
                .build();
        var result = userRepository.save(user);


    }

    public User userLogin(UserLoginRequest userLoginRequest) {
        User user = userRepository.findByEmail(userLoginRequest.getEmail());
        if (user == null || !user.getPassword().equals(userLoginRequest.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }
        return user;
    }

}









//    public User getUser(String id) {
//        User user = userRepository.findAll(id);
//        if (user == null) {
//            throw new RuntimeException("user not find");
//        }
//        return user;
//    }

//    @Override
//    public User updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest, String id) {
//        User user = userRepository.findUserById();
//        if (user == null) {
//            throw new RuntimeException("not found");
//        }
//
//        user.setEmail(updateUserProfileRequest.getEmail());
//        user.setUserName(updateUserProfileRequest.getUsername());
//        user.setPassword(updateUserProfileRequest.getPassword());
//        return userRepository.save(user);
//    }


//    }
//
//    public List<User> getAllUser() {
//        return userRepository.findAll();
//    }










