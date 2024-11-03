package com.Jumia.JumiaWeb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateUserProfileRequest {
    public Long id;
    public String email;
    public String password;
    public String username;
}
