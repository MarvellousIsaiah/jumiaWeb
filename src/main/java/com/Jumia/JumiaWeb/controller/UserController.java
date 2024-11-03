package com.Jumia.JumiaWeb.controller;
import com.Jumia.JumiaWeb.dto.RegisterRequest;
import com.Jumia.JumiaWeb.dto.UserLoginRequest;
import com.Jumia.JumiaWeb.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/user")
@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping("registerUser")
    public void registerUser(@RequestBody RegisterRequest registerRequest){
       userService.registerRequest(registerRequest);

    }
    @PostMapping("userLogin")
    public void userLogin(@RequestBody UserLoginRequest userLoginRequest){
        userService.userLogin(userLoginRequest);

    }
//    @GetMapping("getUser")
//    public User getUser(@RequestParam Long id){
//        User result = userGuruService.getUser(id);
//        return result;

}
