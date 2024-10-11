package com.example.mobile.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    private String email;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
}
