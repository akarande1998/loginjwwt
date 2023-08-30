package com.jwt.latest.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtRequest {
    private String password;
    private String email;
}
