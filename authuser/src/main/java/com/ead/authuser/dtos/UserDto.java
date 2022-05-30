package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto implements Serializable {

    private UUID userId;
    private String username;
    private String email;
    private String password;
    private String oldPassword;
    private String fullName;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;
}
