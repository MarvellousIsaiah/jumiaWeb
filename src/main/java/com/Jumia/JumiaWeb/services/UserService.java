package com.Jumia.JumiaWeb.services;

import com.Jumia.JumiaWeb.data.model.User;
import com.Jumia.JumiaWeb.dto.RegisterRequest;
import com.Jumia.JumiaWeb.dto.UpdateUserProfileRequest;
import com.Jumia.JumiaWeb.dto.UserLoginRequest;

import java.util.List;

public interface UserService {

    void registerRequest(RegisterRequest registerRequest);


        User userLogin(UserLoginRequest userLoginRequest);
    }







