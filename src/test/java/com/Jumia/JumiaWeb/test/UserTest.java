package com.Jumia.JumiaWeb.test;

import com.Jumia.JumiaWeb.data.model.User;
import com.Jumia.JumiaWeb.dto.RegisterRequest;
import com.Jumia.JumiaWeb.dto.UserLoginRequest;
import com.Jumia.JumiaWeb.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @BeforeEach
    void setUp(){

    }
    @Test
    public void testRegisterUser() {

        RegisterRequest registerRequest = RegisterRequest.builder()
                .name("Marvy")
                .userName("@prestige")
                .email("Marvy3@gmail.com")
                .address("yaba")
                .password("123456")

                .build();
        userService.registerRequest(registerRequest);
        assertThat(registerRequest.getUserName()).isEqualTo("@prestige");
    }

    @Test
    public void UserLogin() {
        UserLoginRequest userLoginRequest = UserLoginRequest.builder()
                .email("Marvy@gmail.com")
                .password("123456")
                .build();
        User user = userService.userLogin(userLoginRequest);
        assertThat(user).isNotNull();
        assertThat(user.getUserName()).isEqualTo("@prestige");
    }


}








