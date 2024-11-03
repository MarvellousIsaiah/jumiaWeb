package com.Jumia.JumiaWeb.dto;

import lombok.*;

@AllArgsConstructor
@Builder
@Setter
@Getter
@NoArgsConstructor

public class RegisterRequest {
    private String userName;
    private String address;
    private String email;
    private String password;
    private String name;

}
